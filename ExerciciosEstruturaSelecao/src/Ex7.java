import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE FATORIAL ===\n");
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("ERRO: Fatorial não existe para números negativos!");
            scanner.close();
            return;
        }

        if (numero == 0) {
            System.out.println("0! = 1");
            scanner.close();
            return;
        }

        long fatorial = 1;

        System.out.print(numero + "! = ");
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;

            if (i > 1) {
                System.out.print(i + " × ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println(" = " + fatorial);

        scanner.close();
    }
}