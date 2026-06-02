import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Validador correnteValidacao = new ValidadorLogin();
        correnteValidacao.linkWith(new ValidadorMaiusculo())
                         .linkWith(new ValidadorMinusculo())
                         .linkWith(new ValidadorEspecial())
                         .linkWith(new ValidadorNumero())
                         .linkWith(new ValidadorSequenciaNumeros())
                         .linkWith(new ValidadorTamanhoMinimo())
                         .linkWith(new ValidadorTamanhoMaximo());

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 2) {
            System.out.println("1. Validar Credenciais");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o login: ");
                    String login = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();

                    if (correnteValidacao.validar(login, senha)) {
                        System.out.println("Resultado: Login e senha validos!");
                    }
                    break;
                case 2:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
            System.out.println();
        }
        scanner.close();
    }
}