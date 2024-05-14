package controller;

import model.Cart;
import model.CartItem;
import model.Product;
import view.CartView;

public class CartController {
    private Cart cart;
    private CartView cartView;

    public CartController(Cart cart, CartView cartView) {
        this.cart = cart;
        this.cartView = cartView;
    }

    public void addItemToCart(Product product, int quantity) {
        CartItem item = new CartItem(product, quantity);
        cart.addItem(item);
        cartView.displayCart(cart);
    }

    public void addItemToCart(CartItem item) {
        cart.addItem(item);
    }
}
