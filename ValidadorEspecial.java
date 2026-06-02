public class ValidadorEspecial extends Validador {
    @Override
    public boolean validar(String login, String senha) {
        String especiais = "@#$%&*";
        
        for (char c : senha.toCharArray()) {
            if (especiais.indexOf(c) != -1) {
                return verificarProximo(login, senha);
            }
        }

        System.out.println("Erro: A senha deve possuir pelo menos um caractere especial (@, #, $, %, &, *).");
        return false;
    }
}