package model;

public interface CartSubject {
    void registerObserver(CartObserver observer);
    void removeObserver(CartObserver observer);
    void notifyObservers();
}