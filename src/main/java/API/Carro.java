package API;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int portas){
        super(marca, modelo);
        this.quantidadePortas = portas;
    }

    @Override
    public String toJson(){
        return String.format("{\"tipo\":\"Carro\",\"marca\":\"%s\",\"modelo\":\"%s\",\"portas\":%d}",getMarca(),getModelo(),quantidadePortas);
    }
}
