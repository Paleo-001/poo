package Biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Leitor l1 = new Leitor("João Silva","joaos@gmail.com",15);
        Bibliotecario b1 = new Bibliotecario("Maria da Silva","msilva@gmail.com","Obras raras");
        Participante l2 = new Leitor("Carlos","carlos@gmail.com",12);
        Participante b2 = new Bibliotecario("Zézinho dos Anzóis","zeanz@gmail.com","Livros de Pesca");

        l1.setQuantidadeLivrosLidos(10);
        ((Leitor) l2).setQuantidadeLivrosLidos(8);

        ArrayList<Participante> listaParticipantes = new ArrayList<>();
        listaParticipantes.add(l1);
        listaParticipantes.add(b1);
        listaParticipantes.add(l2);
        listaParticipantes.add(b2);

        System.out.println("=== SISTEMA DE GESTÃO DA BIBLIOTECA ===");
        for (Participante p : listaParticipantes){
            p.exibirInformacoes();
            System.out.println("---------------------------");
        }
    }
}
