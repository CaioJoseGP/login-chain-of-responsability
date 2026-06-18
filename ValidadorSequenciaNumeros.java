public class ValidadorSequenciaNumeros extends Validador {
    @Override
    public boolean validar(String login, String senha) {
        for (int i = 0; i < senha.length() - 2; i++) {
            if (Character.isDigit(senha.charAt(i)) && 
                Character.isDigit(senha.charAt(i + 1)) && 
                Character.isDigit(senha.charAt(i + 2))) {
                
                int n1 = Character.getNumericValue(senha.charAt(i));
                int n2 = Character.getNumericValue(senha.charAt(i + 1));
                int n3 = Character.getNumericValue(senha.charAt(i + 2));
                
                if (n1 + 1 == n2 && n2 + 1 == n3) {
                    System.out.println("Erro: A senha não pode possuir 3 números consecutivos na sequência (Ex: 123).");
                    return false;
                }
            }
        }
        return verificarProximo(login, senha);
    }
}
