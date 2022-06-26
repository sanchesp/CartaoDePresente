package CartaoDePresente;

public abstract class Cartao extends CartaoDePresente{
    private String nomeRemetente;
    private String nomeDestinatario;

    public Cartao(String nomeRemetente, String nomeDestinatario){
        this.nomeRemetente = nomeRemetente;
        this.nomeDestinatario = nomeDestinatario;
    }

    @Override
    public String toString() {
        return "De:" + nomeRemetente+ " Para: "+ nomeDestinatario;
    }
}
