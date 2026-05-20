package MenuInterativo;

import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;   do {
            System.out.println("1. Opção A");
            System.out.println("2. Opção B");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();   switch (opcao) {
                case 1: System.out.println("Executando Opção A."); break;
                case 2: System.out.println("Executando Opção B."); break;
                case 3: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }
}