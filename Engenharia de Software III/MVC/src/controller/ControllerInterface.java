package controller;

import model.CartItem;
import model.Product;

public interface ControllerInterface {
    public void addItemToCart(Product product, int quantity);
    public void addItemToCart(CartItem item);
}
