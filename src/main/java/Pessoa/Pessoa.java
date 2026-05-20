package Pessoa;

class Pessoa {
    String nome;
    int idade;   Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }   void verificarMaioridade() {
        if (idade >= 18) {
            System.out.printf("%s é maior de idade.\n", nome);
        } else {
            System.out.printf("%s é menor de idade.\n", nome);
        }
    }   public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Carlos", 17);
        Pessoa pessoa2 = new Pessoa("Ana", 22);   pessoa1.verificarMaioridade();
        pessoa2.verificarMaioridade();
    }
}