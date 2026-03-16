import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos números você deseja somar? ");
        int quantidade = entrada.nextInt();
        int soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();
            soma = soma + numero;
        }

        System.out.println("A soma total é: \n" + soma);

        entrada.close();

    }
}
