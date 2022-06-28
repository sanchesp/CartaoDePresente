package CartaoDePresente;

public abstract class CartaoDePresente extends Object{

    private String nomeRemetente;
    private String nomeDestinatario;

    public CartaoDePresente(String nomeRemetente, String nomeDestinatario) {
        this.nomeRemetente = nomeRemetente;
        this.nomeDestinatario = nomeDestinatario;
    }
    public abstract String mostrarMensagem();
    @Override
    public String toString() {
        return "De:" + nomeRemetente+ " Para: "+ nomeDestinatario;
    }
}


