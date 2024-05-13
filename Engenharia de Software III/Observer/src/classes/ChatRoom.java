package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observer;
import interfaces.Subject;

public class ChatRoom implements Subject{
    private List<Observer> observers = new ArrayList<>();

    public void sendMessage(String message) {
        System.out.println("Nova mensagem: " + message);
        notifyObservers(message);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
