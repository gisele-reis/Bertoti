package facade;

import classes.Pagamento;
import classes.SelecaoAssentos;
import classes.ReservaVoos;


public class ReservaPassagensFacade {
    private ReservaVoos reservaVoos;
    private SelecaoAssentos selecaoAssentos;
    private Pagamento pagamento;

    public ReservaPassagensFacade() {
        this.reservaVoos = new ReservaVoos();
        this.selecaoAssentos = new SelecaoAssentos();
        this.pagamento = new Pagamento();
    }

    public void reservarPassagem(String origem, String destino, int numeroVoo, int numeroAssento, double valor) {
        reservaVoos.buscarVoos(origem, destino);
        reservaVoos.selecionarVoo(numeroVoo);
        selecaoAssentos.exibirMapaAssentos();
        selecaoAssentos.selecionarAssento(numeroAssento);
        pagamento.processarPagamento(valor);
        System.out.println("Passagem reservada com sucesso!");
    }
}
