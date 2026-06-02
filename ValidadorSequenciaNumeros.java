public class ValidadorSequenciaNumeros extends Validador {
    @Override
    public boolean validar(String login, String senha) {
        for (int i = 0; i < senha.length() - 2; i++) {
            if (Character.isDigit(senha.charAt(i)) && Character.isDigit(senha.charAt(i + 1)) && Character.isDigit(senha.charAt(i + 2))) {
                System.out.println("Erro: A senha não pode possuir 3 números consecutivos na sequência.");
                return false;
            }
        }

        return verificarProximo(login, senha);
    }
}