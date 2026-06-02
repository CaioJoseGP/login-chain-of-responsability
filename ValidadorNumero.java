public class ValidadorNumero extends Validador {
    @Override
    public boolean validar(String login, String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                return verificarProximo(login, senha);
            }
        }
        System.out.println("Erro: A senha deve possuir pelo menos um número.");
        return false;
    }
}