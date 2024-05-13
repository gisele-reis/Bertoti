public class Main {
    public static void main(String[] args) {
        PrinterControl printerControl = PrinterControl.getInstance();

        // Tentando iniciar a impressão duas vezes para demonstrar que apenas uma é permitida
        printerControl.startPrinting();
        printerControl.startPrinting();

        // Finalizando a impressão
        printerControl.finishPrinting();
    }
}
