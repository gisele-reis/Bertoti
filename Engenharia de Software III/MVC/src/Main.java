import controller.CartController;
import model.Cart;
import model.CartItem;
import model.CompositeCartItem;
import model.Product;
import view.CartView;

public class Main {
    public static void main(String[] args) {
       Cart cart = new Cart();
       CartView cartView = new CartView();
       CartController cartController = new CartController(cart, cartView);

       Product product1 = new Product("Camisa", 25.0);
       Product product2 = new Product("Calça", 50.0);
       Product product3 = new Product("Meia", 5.0);

       // Criando itens individuais
       CartItem item1 = new CartItem(product1, 2);
       CartItem item2 = new CartItem(product2, 1);
       CartItem item3 = new CartItem(product3, 3);

       // Criando um grupo de itens (CompositeCartItem)
       CompositeCartItem groupItem = new CompositeCartItem(new Product("Roupas", 0));
       groupItem.addChild(item1);
       groupItem.addChild(item2);

       cartController.addItemToCart(item3);
       cartController.addItemToCart(groupItem);

       cartView.displayCart(cart);

       // Calculando o preço total do carrinho
       double totalPrice = calculateTotalPrice(cart);
       System.out.println("Preço total do carrinho: " + totalPrice);
   }

   private static double calculateTotalPrice(Cart cart) {
       double totalPrice = 0.0;
       for (CartItem item : cart.getItems()) {
           totalPrice += item.getTotalPrice();
       }
       return totalPrice;
   }

}
