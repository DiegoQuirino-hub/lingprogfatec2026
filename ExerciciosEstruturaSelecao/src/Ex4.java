import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o limite inferior: ");
        int limiteInferior = entrada.nextInt();

        System.out.print("Digite o limite superior: ");
        int limiteSuperior = entrada.nextInt();

        System.out.println("\nNúmeros pares entre " + limiteInferior + " e " + limiteSuperior + ":");

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}