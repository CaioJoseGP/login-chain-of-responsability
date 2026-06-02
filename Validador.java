public abstract class Validador {
    protected Validador proximo;

    public Validador linkWith(Validador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract boolean validar(String login, String senha);

    protected boolean verificarProximo(String login, String senha) {
        if (proximo == null) {
            return true;
        }
        
        return proximo.validar(login, senha);
    }
}