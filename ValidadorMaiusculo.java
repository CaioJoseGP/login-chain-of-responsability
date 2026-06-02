public class ValidadorMaiusculo extends Validador {
    @Override
    public boolean validar(String login, String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return verificarProximo(login, senha);
            }
        }
        
        System.out.println("Erro: A senha deve possuir pelo menos um caractere em maiúsculo");
        return false;
    }
}