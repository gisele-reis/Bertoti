package view;

import model.Cart;
import model.CartItem;
import model.CartObserver;
import model.CompositeCartItem;

public class CartView implements CartObserver{
    public void displayCart(Cart cart) {
        System.out.println("Carrinho de Compras:");

        for (CartItem item : cart.getItems()) {
            if (item instanceof CompositeCartItem) {
                CompositeCartItem groupItem = (CompositeCartItem) item;
                System.out.println(groupItem.getProduct().getName() + " - Quantidade: " + groupItem.getQuantity());
                for (CartItem childItem : groupItem.getChildren()) {
                    System.out.println("  " + childItem.getProduct().getName() + " - Quantidade: " + childItem.getQuantity());
                }
            } else {
                System.out.println(item.getProduct().getName() + " - Quantidade: " + item.getQuantity());
            }
        }

        System.out.println("Total: " + calculateTotal(cart));
    }

    private double calculateTotal(Cart cart) {
        double total = 0.0;

        for (CartItem item : cart.getItems()) {
            total += item.getTotalPrice();
        }

        return total;
    }

    @Override
    public void update(Cart cart) {
        displayCart(cart);
    }
}
