import java.sql.SQLOutput;
import java.util.Scanner;

public class ClacularNotaWhileContinue {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int condicao = 1;
        float nota = 0;
        float soma = 0;
        System.out.println("Insira as notas abaixo: ");
        while (condicao <= 5) {
            nota = entrada.nextInt();
            if (nota < 0 || nota > 10){
                System.out.println(" Nota Inválida. Tente Novamente ");
                continue;
            }
            condicao++;
            soma += nota;
        }
        float media = soma / 5;
        System.out.println("Média é: "+ media);
    }
}
