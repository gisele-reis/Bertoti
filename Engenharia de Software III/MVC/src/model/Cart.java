package model;

import java.util.ArrayList;
import java.util.List;

public class Cart implements CartSubject{
    private List<CartItem> items;
    private List<CartObserver> observers;

    public Cart() {
        items = new ArrayList<>();
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(CartObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(CartObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (CartObserver observer : observers) {
            observer.update(this);
        }
    }

    public void addItem(CartItem item) {
        items.add(item);
        notifyObservers();
    }

    public List<CartItem> getItems() {
        return items;
    }

}
