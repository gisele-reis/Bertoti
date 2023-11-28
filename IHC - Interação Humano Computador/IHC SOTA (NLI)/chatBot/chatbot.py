import telebot
import pandas as pd
import requests


API_TOKEN = ""
CHATCSV_API_URL = "https://www.chatcsv.co/api/v1/chat"

bot = telebot.TeleBot(API_TOKEN)

df = pd.read_csv(
    "https://gist.githubusercontent.com/vr-23/d6a4a0aadcf3a2640091ca43c25e1955/raw/57b9cb74b24dc87b489c74cc4e11209cd5720642/world-data-2023.csv",
    on_bad_lines="skip",
)


def get_chatcsv_response(messages, files):
    headers = {
        "accept": "text/event-stream",
        "Content-Type": "application/json",
        "Authorization": "Bearer sk_3ZWcp48qBTD7VcuQZ6KU2nRH",
    }

    data = {
        "model": "gpt-3.5-turbo-16k-0613",
        "messages": messages,
        "files": files,
    }

    try:
        response = requests.post(CHATCSV_API_URL, json=data, headers=headers)
        response.raise_for_status()

        print("Conteúdo exato da resposta da API:")
        print(response.text)

        if response.text:  # Check if the response is not empty
            try:
                return response.json()
            except ValueError:
                print("A resposta não está em formato JSON. Retornando como texto.")
                return response.text
        else:
            print("Resposta vazia da API ChatCSV.")
            return None

    except requests.exceptions.HTTPError as errh:
        print(f"HTTP Error: {errh}")
    except requests.exceptions.ConnectionError as errc:
        print(f"Error Connecting: {errc}")
    except requests.exceptions.Timeout as errt:
        print(f"Timeout Error: {errt}")
    except requests.exceptions.RequestException as err:
        print(f"Request Exception: {err}")

    print("Conteúdo da resposta da API:")
    print(response.text)  # Imprime o conteúdo da resposta para diagnóstico
    return None


@bot.message_handler(func=lambda message: True)
def response(message):
    try:
        user_message = {"role": "user", "content": message.text}
        assistant_message = {"role": "assistant", "content": "placeholder"} 

        conversa = [user_message, assistant_message]

        arquivos = ["https://gist.githubusercontent.com/vr-23/d6a4a0aadcf3a2640091ca43c25e1955/raw/57b9cb74b24dc87b489c74cc4e11209cd5720642/world-data-2023.csv"]

        resposta_chatcsv = get_chatcsv_response(conversa, arquivos)

        if resposta_chatcsv is not None:
            if isinstance(resposta_chatcsv, dict) and "choices" in resposta_chatcsv:
                resposta_assistente = resposta_chatcsv["choices"][-1]["message"]["content"]
            else:
                resposta_assistente = resposta_chatcsv
            bot.reply_to(message, resposta_assistente)
        else:
            bot.reply_to(message, "Ocorreu um erro ao consultar a API ChatCSV.")

    except Exception as e:
        print(f"Erro na consulta do DataFrame: {str(e)}")
        bot.reply_to(message, "Ocorreu um erro ao consultar o DataFrame.")


bot.polling()
