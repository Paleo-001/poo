package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();   int primeiro = 0, segundo = 1, proximo;   System.out.println("Sequência de Fibonacci com " + n + " termos:");
        for (int i = 0; i \< n; i++) {
            System.out.print(primeiro + " ");
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}