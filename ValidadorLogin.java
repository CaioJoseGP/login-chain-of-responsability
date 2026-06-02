public class ValidadorLogin extends Validador {
    private String[] loginsCadastrados = {"admin", "usuario123", "caio_jose"};

    @Override
    public boolean validar(String login, String senha) {
        boolean cadastrado = false;
        
        for (String s : loginsCadastrados) {
            if (s.equals(login)) {
                cadastrado = true;
                break;
            }
        }

        if (!cadastrado) {
            System.out.println("Erro: Login não está cadastrado no sistema");
            return false;
        }

        return verificarProximo(login, senha);
    }
}