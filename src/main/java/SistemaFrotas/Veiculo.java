public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double valorDiaria;

    public Veiculo(String placa, String marca, String modelo, double valorDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    // Método que será sobrescrito (Polimorfismo) nas subclasses
    public double calcularAluguel(int dias) {
        return this.valorDiaria * dias;
    }

    // Getters e Setters (Encapsulamento)
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getValorDiaria() { return valorDiaria; }
}