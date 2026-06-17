package Observer;

public class TesteObserverEcommerce {
    public static void main(String[] args) {
        PedidoEcommerce pedido = new PedidoEcommerce("BR-45899");
        ObservadorStatus servicoEmail = new ServicoEmail();
        ObservadorStatus servicoApp = new ServicoNotificacaoPush();
        ObservadorStatus servicoLog = new ServicoLogAuditoria();

        pedido.adicionarObservador(servicoEmail);
        pedido.adicionarObservador(servicoApp);
        pedido.adicionarObservador(servicoLog);

        pedido.setStatus("Pagamento aprovado.");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        pedido.setStatus("Em transporte");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        pedido.setStatus("Entrega ao Destinatário");
    }
}