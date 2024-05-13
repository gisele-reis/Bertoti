package classes.composite;

import java.util.ArrayList;
import java.util.List;

import interfaces.ItemMenu;

public class Categoria implements ItemMenu{
    private String name;
    public List<ItemMenu> items = new ArrayList<>();

    public Categoria(String name) {
        this.name = name;
    }

    public void addMenuItem(ItemMenu item) {
        items.add(item);
    }

    public void removeMenuItem(ItemMenu item) {
        items.remove(item);
    }

    public String getItemInfo(int index) {
        if (index >= 0 && index < items.size()) {
            ItemMenu item = items.get(index);
            return item.getName() + " - $" + item.getPrice();
        } else {
            return null;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (ItemMenu item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void displayCategoryItems() {
        System.out.println("Categoria: " + getName());
        for (ItemMenu item : items) {
            System.out.println(" - " + item.getName() + " - R$" + item.getPrice());
        }
    }
}
