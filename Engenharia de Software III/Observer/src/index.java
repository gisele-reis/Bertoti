import classes.ChatRoom;
import classes.User;

/**
 * index
 */
public class index {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Katarina");
        User user2 = new User("Luciano");
        User user3 = new User("Elise");

        chatRoom.registerObserver(user1);
        chatRoom.registerObserver(user2);
        chatRoom.registerObserver(user3);

        chatRoom.sendMessage("Olá, pessoal!");

        chatRoom.removeObserver(user2);

        chatRoom.sendMessage("Luciano saiu da sala.");
    }
}