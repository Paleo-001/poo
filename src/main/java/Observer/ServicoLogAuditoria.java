package Observer;

public class ServicoLogAuditoria implements ObservadorStatus{
    @Override
    public void atualizar(String numeroPedido, String novoStatus){
        System.out.println("[SISTEMA LOG] (Gravação em BD) Status do pedido " + numeroPedido + " alterado para: " + novoStatus);
    }
}
