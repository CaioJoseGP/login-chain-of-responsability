public class ValidadorMinusculo extends Validador {
    @Override
    public boolean validar(String login, String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return verificarProximo(login, senha);
            }
        }

        System.out.println("Erro: A senha deve possuir pelo menos um caractere em minúsculo.");
        return false;
    }
}