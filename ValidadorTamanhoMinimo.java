public class ValidadorTamanhoMinimo extends Validador {
    @Override
    public boolean validar(String login, String senha) {
        if (senha.length() < 8) {
            System.out.println("Erro: A senha deve ter pelo menos 8 caracteres.");
            return false;
        }
        
        return verificarProximo(login, senha);
    }
}