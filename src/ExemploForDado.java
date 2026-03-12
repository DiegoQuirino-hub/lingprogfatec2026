import java.util.Scanner;

public class ExemploForDado {
    public static void main (String[] args){
        // pede ao usuário para informar quantidade de vezes que irá jogar o dado
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Informe a qtdade que você lançará  o dado: ");
        int qtde = entrada.nextInt();
        System.out.println("Escolha o número você gostaria de acertar entre 1 e 6 ");
        int numero = entrada.nextInt();
        int conta = 0; // conta quantas vezes acertou o numero escolhido

        while (numero < 1 || numero > 6){
            System.out.println("Numero deve ser entre 1 e 6");
        }

        for(int i=1; i<= qtde; i++){
           int aleatorio = (int) (Math.random() * 6 + 1);
            System.out.println("Dado lançado: " + aleatorio);
            if (aleatorio == numero){
                conta++;
            }
        }
        System.out.println("Quantidade de acertos " + conta);
        System.out.println("% de acerto = " +((float)conta/qtde) * 100);
    }
}
