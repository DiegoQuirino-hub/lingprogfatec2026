import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SIMULADOR DE INVESTIMENTO COM JUROS ===\n");

        System.out.print("Digite o valor do depósito inicial (R$): ");
        double saldoAtual = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJuros = scanner.nextDouble();

        taxaJuros = taxaJuros / 100;

        double saldoInicial = saldoAtual;

        System.out.println("\n--- EVOLUÇÃO DO SALDO EM 12 MESES ---\n");
        System.out.printf("Mês 0 (Inicial): R$ %.2f\n", saldoAtual);

        for (int mes = 1; mes <= 12; mes++) {

            saldoAtual = saldoAtual * (1 + taxaJuros);

            System.out.printf("Mês %2d: R$ %.2f\n", mes, saldoAtual);
        }
        double rendimento = saldoAtual - saldoInicial;
        double percentualGanho = (rendimento / saldoInicial) * 100;

        System.out.println("\n--- RESUMO ---");
        System.out.printf("Saldo inicial: R$ %.2f\n", saldoInicial);
        System.out.printf("Saldo final: R$ %.2f\n", saldoAtual);
        System.out.printf("Rendimento total: R$ %.2f\n", rendimento);
        System.out.printf("Percentual de ganho: %.2f%%\n", percentualGanho);

        scanner.close();
    }
}
