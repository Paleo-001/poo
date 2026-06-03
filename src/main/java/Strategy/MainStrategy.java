package Strategy;

public class MainStrategy {
    public static void main(String[] args){
        Pedido meuPedido = new Pedido();
        double pesoEncomenda = 10.0;
        meuPedido.setEstrategiaFrete(new FreteSedex());
        double valorSedex = meuPedido.calcularTotalFrete(pesoEncomenda);
        System.out.println("Valor do frete via Sedex: R$ " + valorSedex);
        meuPedido.setEstrategiaFrete(new FreteNormal());
        double valorNormal = meuPedido.calcularTotalFrete(pesoEncomenda);
        System.out.println("Valor do frete via Normal: R$ " + valorNormal);
    }
}
