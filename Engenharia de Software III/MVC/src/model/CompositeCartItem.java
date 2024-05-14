package model;

import java.util.ArrayList;
import java.util.List;

public class CompositeCartItem extends CartItem{
    private List<CartItem> children;

    public CompositeCartItem(Product product) {
        super(product, 0);
        children = new ArrayList<>();
    }

    public void addChild(CartItem item) {
        children.add(item);
    }

    public List<CartItem> getChildren() {
        return children;
    }

    @Override
    public int getQuantity() {
        int totalQuantity = super.getQuantity();
        for (CartItem item : children) {
            totalQuantity += item.getQuantity();
        }
        return totalQuantity;
    }

   @Override
    public double getTotalPrice() {
        double totalPrice = super.getTotalPrice();
        for (CartItem item : children) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
