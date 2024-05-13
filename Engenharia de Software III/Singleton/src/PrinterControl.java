public class PrinterControl {
    private static PrinterControl instance;
    private boolean printingInProgress;

    private PrinterControl() {
        printingInProgress = false;
    }

    public static PrinterControl getInstance() {
        if (instance == null) {
            instance = new PrinterControl();
        }
        return instance;
    }

    public void startPrinting() {
        if (!printingInProgress) {
            printingInProgress = true;
            System.out.println("Iniciando impressão...");
        } else {
            System.out.println("Já existe uma impressão em andamento.");
        }
    }

    public void finishPrinting() {
        if (printingInProgress) {
            printingInProgress = false;
            System.out.println("Impressão finalizada.");
        } else {
            System.out.println("Não há impressão em andamento para finalizar.");
        }
    }
}
