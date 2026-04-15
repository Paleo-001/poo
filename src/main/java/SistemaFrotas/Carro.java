public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String marca, String modelo, double valorDiaria, int numPortas) {
        super(placa, marca, modelo, valorDiaria);
        this.numPortas = numPortas;
    }

    @Override
    public double calcularAluguel(int dias) {
        double valorBase = super.calcularAluguel(dias);
        if (numPortas > 2) {
            return valorBase * 1.10; // Acréscimo de 10%
        }
        return valorBase;
    }

    public int getNumPortas() { return numPortas; }
}