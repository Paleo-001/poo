package Livraria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LivroDAO dao = new LivroDAO();

        System.out.println("Cadastro de Livros");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Ano: ");
        int ano = sc.nextInt();

        Livro livro = new Livro(titulo,autor,ano);
        dao.inserir(livro);

        System.out.println("\nLivros Cadastrados");
        for (Livro l : dao.listarTodos()){
            System.out.printf("%d - %s (%s, %d)\n",l.getId(),l.getTitulo(),l.getAutor(),l.getAno());
        }
    }
}
