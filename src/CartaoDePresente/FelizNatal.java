package CartaoDePresente;

public class FelizNatal extends Cartao{

    public FelizNatal(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }
    @Override
    public String mostrarMensagem () {
        return "Desejo um mundo cheio de corações felizes, alegres e em paz. Feliz Natal!";
    }
}

