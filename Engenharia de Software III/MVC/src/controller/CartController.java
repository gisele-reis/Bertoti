package controller;

import model.Cart;
import model.CartItem;
import model.Product;
import view.CartView;

public class CartController implements ControllerInterface{
    private Cart cart;
    private CartView cartView;

    public CartController(Cart cart, CartView cartView) {
        this.cart = cart;
        this.cartView = cartView;
    }

    @Override
    public void addItemToCart(Product product, int quantity) {
        CartItem item = new CartItem(product, quantity);
        cart.addItem(item);
        cartView.displayCart(cart);
    }

    @Override
    public void addItemToCart(CartItem item) {
        cart.addItem(item);
    }
}
