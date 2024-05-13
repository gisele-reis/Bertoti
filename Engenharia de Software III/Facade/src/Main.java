import facade.ReservaPassagensFacade;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ReservaPassagensFacade reserva = new ReservaPassagensFacade();

        reserva.reservarPassagem("São Paulo", "Nova York", 907, 12, 4500.00);
    }
}