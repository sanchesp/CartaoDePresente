package CartaoDePresente;

public abstract class CartaoDePresente extends Object{

    private String nomeRemetente;
    private String nomeDestinatario;

    public CartaoDePresente(){
    }

    public abstract String mostrarMensagem ();
}
