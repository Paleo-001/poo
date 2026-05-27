package Jogo;

public class Chefe extends Personagem{
    private int multiplicadorDano;

    public Chefe(String nome, int pontosVida, int nivel, int multiplicadorDano){
        super(nome,pontosVida,nivel);
        this.multiplicadorDano = multiplicadorDano;
    }

    @Override
    public void atacar(Personagem alvo){
        System.out.println("O " + getNome() + " desfere um ataque devastador contra " + alvo.getNome() + "!");
        alvo.receberDano(15 * this.multiplicadorDano);
    }
}
