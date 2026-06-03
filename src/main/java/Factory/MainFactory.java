package Factory;

public class MainFactory {
    public static void main(String[] args){
        Veiculo meuCarro = VeiculoFactory.criarVeiculo("carro");
        meuCarro.acelerar();
        Veiculo minhaMoto = VeiculoFactory.criarVeiculo("mOtO");
        minhaMoto.acelerar();
    }
}
