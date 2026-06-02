public class ValidadorTamanhoMaximo extends Validador {
    @Override
    public boolean validar(String login, String senha) {
        if (senha.length() > 16) {
            System.out.println("Erro: A senha não deve ter mais de 16 caracteres.");
            return false;
        }
        
        return verificarProximo(login, senha);
    }
}