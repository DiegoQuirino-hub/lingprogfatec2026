import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = entrada.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite novamente.\n");
            }
        }

        System.out.println("Nota aceita: \n" + nota);

        entrada.close();
    }
}
