package CartaoDePresente;

public class DiaDosNamorados extends Cartao{

    public DiaDosNamorados(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }
    @Override
    public String mostrarMensagem () {
        return "Amor, paixão, carinho, amizade, cumplicidade, afeto, lealdade, fidelidade, respeito… Encontrei tudo isso em uma só pessoa, você!";
    }
}
