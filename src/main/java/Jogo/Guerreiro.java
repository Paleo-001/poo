package Jogo;

public class Guerreiro extends Personagem{
    private int forcaFisica;

    public Guerreiro(String nome, int pontosVida, int nivel, int forcaFisica) {
        super(nome, pontosVida, nivel);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public void atacar(Personagem alvo){
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com a sua espada pesada!");
        alvo.receberDano(this.forcaFisica + 5);
    }

    public void usarEscudo(){
        System.out.println(getNome() + " levantou o escudo e aumentou a sua defesa!");
    }
}
