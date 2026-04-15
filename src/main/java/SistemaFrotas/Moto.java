public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String placa, String marca, String modelo, double valorDiaria, int cilindrada) {
        super(placa, marca, modelo, valorDiaria);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularAluguel(int dias) {
        double valorBase = super.calcularAluguel(dias);
        if (cilindrada > 500) {
            return valorBase * 1.15; // Acréscimo de 15%
        }
        return valorBase;
    }

    public int getCilindrada() { return cilindrada; }
}