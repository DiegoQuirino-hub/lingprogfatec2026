
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SEQUÊNCIA DE FIBONACCI ===\n");
        System.out.print("Quantos termos você quer ver? ");
        int quantidadeTermos = scanner.nextInt();

        if (quantidadeTermos <= 0) {
            System.out.println("ERRO: Digite um número maior que zero!");
            scanner.close();
            return;
        }

        long numero1 = 0;
        long numero2 = 1;

        System.out.println("\n--- SEQUÊNCIA ---\n");

        for (int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(numero1);

            long proximoNumero = numero1 + numero2;

            numero1 = numero2;
            numero2 = proximoNumero;

            if (i < quantidadeTermos) {
                System.out.print(", ");
            }
        }

        System.out.println("\n");

        scanner.close();
    }
}