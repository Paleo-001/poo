package Factory;

public class VeiculoFactory {
    public static Veiculo criarVeiculo(String tipo){
        /*
        if (tipo.equalsIgnoreCase("CARRO")) return new Carro();
        if (tipo.equalsIgnoreCase("MOTO")) return new Moto();
         */
        return switch (tipo.toUpperCase()){
            case "CARRO" ->
                    new Carro();
            case "MOTO" ->
                    new Moto();
            case null, default ->
                throw new IllegalArgumentException("Tipo de veículo desconhecido");
        };
    }
}
