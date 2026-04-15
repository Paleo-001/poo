import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFrota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Veiculo> frota = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- GESTÃO DE FROTA ---");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Listar Frota (Simulação 5 dias)");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpar buffer

            if (opcao == 1 || opcao == 2) {
                System.out.print("Placa: "); String p = teclado.nextLine();
                System.out.print("Marca: "); String ma = teclado.nextLine();
                System.out.print("Modelo: "); String mo = teclado.nextLine();
                System.out.print("Valor Diária: "); double v = teclado.nextDouble();

                if (opcao == 1) {
                    System.out.print("Nº Portas: "); int portas = teclado.nextInt();
                    frota.add(new Carro(p, ma, mo, v, portas));
                } else {
                    System.out.print("Cilindrada: "); int cil = teclado.nextInt();
                    frota.add(new Moto(p, ma, mo, v, cil));
                }
                System.out.println("Veículo cadastrado com sucesso!");
            }
            else if (opcao == 3) {
                System.out.println("\n--- LISTAGEM ---");
                for (Veiculo v : frota) {
                    System.out.printf("Veículo: %s %s | Placa: %s | Aluguel (5 dias): R$ %.2f\n",
                            v.getMarca(), v.getModelo(), v.getPlaca(), v.calcularAluguel(5));
                }
            }
        } while (opcao != 4);

        System.out.println("Sistema encerrado.");
        teclado.close();
    }
}