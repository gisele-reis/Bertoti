import classes.composite.Categoria;
import classes.leaf.Item;
import interfaces.ItemMenu;

/**
 * index
 */
public class index {

    private static void displayMenuItems(ItemMenu menuItem) {
        if (menuItem instanceof Categoria) {
            Categoria category = (Categoria) menuItem;
            category.displayCategoryItems();
            for (ItemMenu item : category.items) {
                displayMenuItems(item);
            }
        }
    }

    public static void main(String[] args) {
        Categoria entradas = new Categoria("Entradas");
        Categoria pratosPrincipais = new Categoria("Pratos Principais");
        Categoria sobremesas = new Categoria("Sobremesas");
        Categoria bebidas = new Categoria("Bebidas");

        entradas.addMenuItem(new Item("Salada", 14.99));
        entradas.addMenuItem(new Item("Pão de Alho", 7.99));

        pratosPrincipais.addMenuItem(new Item("Salmão Grelhado",25.90));
        pratosPrincipais.addMenuItem(new Item("Spaghetti Carbonara",21.50));

        bebidas.addMenuItem(new Item("Água",2.99));
        bebidas.addMenuItem(new Item("Água com gás",3.75));
        bebidas.addMenuItem(new Item("Suco",5.80));
        bebidas.addMenuItem(new Item("Refrigerante",7.50));

        Item sobremesa1 = new Item("Bolo de Chocolate", 5.99);
        Item sobremesa2 = new Item("Sorvete", 3.99);
        sobremesas.addMenuItem(sobremesa1);
        sobremesas.addMenuItem(sobremesa2);

        Categoria menuCompleto = new Categoria("Cardápio Completo");
        menuCompleto.addMenuItem(entradas);
        menuCompleto.addMenuItem(pratosPrincipais);
        menuCompleto.addMenuItem(sobremesas);
        menuCompleto.addMenuItem(bebidas);

        displayMenuItems(menuCompleto);

        System.out.println("Preço Total do cardápio completo: R$" + menuCompleto.getPrice());
    }
}