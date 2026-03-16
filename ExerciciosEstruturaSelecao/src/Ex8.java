import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto;
        double precoProduto;
        char continuar;

        String produtoMaisCaro = "";
        double precoMaisCaro = 0;
        int quantidadeProdutos = 0;

        System.out.println("=== CADASTRO DE PRODUTOS ===\n");

        while (true) {
            System.out.print("Digite o nome do produto: ");
            nomeProduto = scanner.nextLine();

            System.out.print("Digite o preço do produto: R$ ");
            precoProduto = scanner.nextDouble();
            scanner.nextLine();

            quantidadeProdutos++;

            if (precoProduto > precoMaisCaro) {
                precoMaisCaro = precoProduto;
                produtoMaisCaro = nomeProduto;
            }

            System.out.print("\nDeseja continuar? (S/N): ");
            continuar = scanner.nextLine().toUpperCase().charAt(0);

            if (continuar == 'N') {
                System.out.println("\n✅ Cadastro finalizado!\n");
                break;
            }

            System.out.println();
        }

        if (quantidadeProdutos > 0) {
            System.out.println("--- RESULTADO ---");
            System.out.println("Total de produtos cadastrados: " + quantidadeProdutos);
            System.out.println("Produto mais caro: " + produtoMaisCaro);
            System.out.printf("Preço: R$ %.2f\n", precoMaisCaro);
        }

        scanner.close();
    }
}