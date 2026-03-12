import java.util.Scanner;

public class CalculadoraEnergia {
    public void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo: ");
        String nome = entrada.next();
        System.out.println("Escreva abaixo qual a leitura do mês anterior do medidor: ");
        int leituraAnterior = entrada.nextInt();
        System.out.println("Escreva abaixo a leitura atual deste mês: ");
        int leituraAtual = entrada.nextInt();

        int consumoMes = leituraAtual - leituraAnterior;
        double Kwh = 0.6;
        double valorBruto = consumoMes * Kwh;
        double adicionalBandeira = 0;
        String corBandeira ="";
        double TotalPagar = valorBruto + adicionalBandeira;

        if(consumoMes <= 100){
            corBandeira = "Verde.";
            adicionalBandeira = 0.0;
        }else if (consumoMes > 100 && consumoMes <= 200){
            corBandeira = "Bandeira Amarela.";
            adicionalBandeira = 2.0;
        } else if (consumoMes > 200 && consumoMes <= 300){
            corBandeira = "Bandeira Vermelha.";
            adicionalBandeira = 5.00;
        }else{
            corBandeira = "Preta.";
            adicionalBandeira = 10.00;
        }

        System.out.println("---------------------------------------");
        System.out.println("Nome cliente: "+ nome);
        System.out.println("Consumo total: " + consumoMes + " Kwh");
        System.out.println("Cor da Bandeira: " + corBandeira);
        System.out.println("Valor total a pagar R$ " + TotalPagar + " reais");
    }
}

