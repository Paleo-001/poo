package Strategy;

public class Pedido {
    private EstrategiaFrete estrategiaFrete;
    public void setEstrategiaFrete(EstrategiaFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }
    public double calcularTotalFrete(double peso){
        return estrategiaFrete.calcular(peso);
    }
}
