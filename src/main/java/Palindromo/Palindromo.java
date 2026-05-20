package Palindromo;
import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = scan.nextLine();
        String fraseLimpa = frase.toLowerCase().replace(" ","").replace(".","").replace(",","");
        int tamanho = fraseLimpa.length();
        StringBuilder sb = new StringBuilder();
        for (int i = tamanho - 1;i >= 0; i--){
            sb.append(fraseLimpa.substring(i,i + 1));
        }
        if (fraseLimpa.equals(sb.toString())){
            System.out.println("A frase é um palíndromo!");
        } else {
            System.out.println("A frase não é um palíndromo!");
        }
    }
}
