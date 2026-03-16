
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int somaIdades = 0;
        int quantidadeIdades = 0;

        System.out.println("=== CÁLCULO DE MÉDIA DE IDADES ===");
        System.out.println("Digite as idades dos alunos.");
        System.out.println("Digite um número NEGATIVO para encerrar.\n");

        while (true) {
            System.out.print("Digite uma idade (ou número negativo para sair): ");
            idade = scanner.nextInt();

            if (idade < 0) {
                System.out.println(" Entrada encerrada!\n");
                break;
            }
            somaIdades += idade;
            quantidadeIdades++;
            System.out.println("✓ Idade registrada!\n");
        }

        if (quantidadeIdades > 0) {
            double media = (double) somaIdades / quantidadeIdades;
            System.out.println("--- RESULTADO ---");
            System.out.println("Total de alunos: " + quantidadeIdades);
            System.out.println("Soma das idades: " + somaIdades);
            System.out.printf("Média de idades: %.2f anos\n", media);
        } else {
            System.out.println("Nenhuma idade foi digitada!");
        }

        scanner.close();
    }
}