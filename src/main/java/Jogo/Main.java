package Jogo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Guerreiro aragorn = new Guerreiro("Aragorn",100,10,15);
        Mago gandalf = new Mago("Gandalf",70,12,20,100);
        Chefe sauron = new Chefe("Sauron",300,50,3);

        System.out.println("--- INÍCIO DA BATALHA ---");
        aragorn.exibirStatus();
        gandalf.exibirStatus();
        sauron.exibirStatus();

        System.out.println("\n--- TURNO 1 ---");
        gandalf.atacar(sauron);
        sauron.atacar(aragorn);

        System.out.println("\n--- TURNO 2 ---");
        gandalf.curar(aragorn);
        aragorn.atacar(sauron);

        System.out.println("\n--- STATUS FINAL ---");
        ArrayList<Personagem> todosPersonagens = new ArrayList<>();
        todosPersonagens.add(aragorn);
        todosPersonagens.add(gandalf);
        todosPersonagens.add(sauron);
        for (Personagem p : todosPersonagens){
            p.exibirStatus();
        }
    }
}
