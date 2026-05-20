package Palindromo2;
import java.util.Scanner;
public class Palindromo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = scan.nextLine();
        String fraseLimpa = frase.toLowerCase().replace(" ", "").replace(".", "").replace(",", "");
        String fraseInvertida = new StringBuilder(fraseLimpa).reverse().toString();
        if (fraseLimpa.equals(fraseInvertida)) {
            System.out.println("A frase é um palíndromo!");
        } else {
            System.out.println("A frase não é um palíndromo!");
        }
    }
}