package Observer;

public class ServicoEmail implements ObservadorStatus {
    @Override
    public void atualizar(String numeroPedido, String novoStatus){
        System.out.println("[E-MAIL ENVIADO] Prezado cliente, seu pedido " + numeroPedido + " agora está: " + novoStatus);
    }
}
