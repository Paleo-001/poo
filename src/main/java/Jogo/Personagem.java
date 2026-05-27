package Jogo;

public abstract class Personagem {
    private String nome;
    private int pontosVida;
    private int nivel;

    public Personagem(String nom, int pv, int niv){
        this.nome = nom;
        this.pontosVida = pv;
        this.nivel = niv;
    }

    public abstract void atacar(Personagem alvo);

    public void receberDano(int quantidade){
        this.pontosVida -= quantidade;
        if (this.pontosVida < 0) this.pontosVida = 0;
        System.out.println(this.nome + " sofreu " + quantidade + " de dano.\nVida restante: " + this.pontosVida);
    }

    public void exibirStatus(){
        System.out.println(">>> [" + this.nome + "] Nível: " + this.nivel + " | Vida: " + this.pontosVida);
    }

    public String getNome() {
        return nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
