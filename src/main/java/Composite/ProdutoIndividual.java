package Composite;

public class ProdutoIndividual implements ItemComercial{
    private String nome;
    private double preco;

    public ProdutoIndividual(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularPreco(){
        return preco;
    }

    @Override
    public void exibirDetalhes(String indentacao){
        System.out.printf("%s- Produto: %s (R$ %,.2f)\n", indentacao,nome,preco);
    }
}
