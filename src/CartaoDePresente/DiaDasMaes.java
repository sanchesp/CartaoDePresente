package CartaoDePresente;

public class DiaDasMaes extends CartaoDePresente{

    public DiaDasMaes(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }
    @Override
    public String mostrarMensagem () {
        return "Mãe\n" +
                "Palavra pequena, mas com um significado infinito, pois quer dizer amor, dedicação, renúncia a si própria, força e sabedoria. " +
                "Ser mãe não é só dar à luz, e sim participar da vida dos seus frutos gerados ou criados.\n" +
                "Obrigado por termos você";
    }

}
