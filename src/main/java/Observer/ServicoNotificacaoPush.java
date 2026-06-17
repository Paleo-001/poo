package Observer;

public class ServicoNotificacaoPush implements ObservadorStatus{
    @Override
    public void atualizar(String numeroPedido, String novoStatus){
        System.out.println("[PUSH APP] Notificação no celular: Pedido " + numeroPedido + " atualizado para -> " + novoStatus);
    }
}
