package Biblioteca;

public class Leitor extends Participante{
    private int quantidadeLivrosLidos;

    public Leitor(String nome, String email, int quantidade){
        super(nome, email);
        this.quantidadeLivrosLidos = quantidade;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Livros lidos: " + quantidadeLivrosLidos);
    }

    public int getQuantidadeLivrosLidos() {
        return quantidadeLivrosLidos;
    }

    public void setQuantidadeLivrosLidos(int quantidadeLivrosLidos) {
        this.quantidadeLivrosLidos = quantidadeLivrosLidos;
    }
}
