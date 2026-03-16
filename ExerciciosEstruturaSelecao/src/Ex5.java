import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuario;
        String senha;
        boolean senhaInvalida = true;

        while (senhaInvalida) {
            System.out.print("Digite o nome de usuário: ");
            usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("ERRO: A senha não pode ser igual ao usuário!");
                System.out.println("Tente novamente.\n");
            } else {

                System.out.println("✅ Login realizado com sucesso!");
                senhaInvalida = false;
            }
        }

        scanner.close();
    }
}
