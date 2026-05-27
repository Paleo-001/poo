package Interface;

public class CartaoCredito implements Pagavel{
    @Override
    public void pagar() {
        System.out.println("Pagamento no Cartão de Crédito");
    }
}
