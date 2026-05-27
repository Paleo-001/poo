package Jogo;

public class Mago extends Personagem implements Curandeiro{
    private int poderMagico;
    private int mana;

    public Mago(String nm, int pv, int nv, int pm, int mn){
        super(nm,pv,nv); // nome,pontosVida,nivel
        this.poderMagico = pm;
        this.mana = mn;
    }

    @Override
    public void atacar(Personagem alvo){
        System.out.println(getNome() + " dispara uma bola de fogo contra " + alvo.getNome() + "!");
        alvo.receberDano(this.poderMagico * 2);
        this.mana -= 10;
    }

    public void curar(Personagem alvo){
        if (this.mana >= 20){
            System.out.println(getNome() + " usa magia de cura em " + alvo.getNome() + "!");
            this.mana -= 20;
            alvo.setPontosVida(alvo.getPontosVida() + 30);
            System.out.println(alvo.getNome() + " recuperou vida!");
        } else {
            System.out.println(getNome() + " não tem mana suficiente para curar!");
        }
    }
}
