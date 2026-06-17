package Observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoEcommerce {
    private String numeroPedido;
    private String statusAtual;
    private List<ObservadorStatus> observadores = new ArrayList<>();

    public PedidoEcommerce(String numeroPedido){
        this.numeroPedido = numeroPedido;
        this.statusAtual = "Criado.";
    }

    public void adicionarObservador(ObservadorStatus obs){
        observadores.add(obs);
    }

    public void setStatus(String novoStatus){
        this.statusAtual = novoStatus;
        System.out.println("\n>>> MUDANÇA DE ESTADO: Pedido " + numeroPedido + " mudou para '" + novoStatus + "' <<<");
        notificarObservadores();
    }

    private void notificarObservadores(){
        for(ObservadorStatus obs: observadores){
            obs.atualizar(this.numeroPedido, this.statusAtual);
        }
    }
}
