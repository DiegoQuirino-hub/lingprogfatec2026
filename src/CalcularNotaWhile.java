import java.util.Scanner;

public class CalcularNotaWhile {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int condicao = 1;
        float nota = 0;
        float soma = 0;
        while (condicao <=10){
            System.out.println(" Informe a nota: ");
            nota = entrada.nextInt();
            if (nota < 0){
                break; // força a saida do while
            }
            soma += nota;
            condicao++;
        }
        if ( condicao == 11) {// foi normal, sem entrar no break
            float media = soma / 10;
            System.out.println("A média é " + media);
        }
        else {
            System.out.println("Nota inválida ");
        }
    }
}
