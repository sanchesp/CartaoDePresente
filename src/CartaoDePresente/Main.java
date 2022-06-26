package CartaoDePresente;

public class Main {
    public static void main(String[] args) {
        DiaDasMaes cartaoDiaDasMaes = new DiaDasMaes("Marcos", "Janaina");
        DiaDosNamorados cartaoDiaDosNamorados = new DiaDosNamorados("Marcos", "Marta");
        FelizNatal cartaoDeNatal = new FelizNatal("Marcos", "Familia");


        imprimirCartao(cartaoDiaDasMaes);
        imprimirCartao(cartaoDiaDosNamorados);
        imprimirCartao(cartaoDeNatal);
    }

    public static void imprimirCartao (Cartao cartao) {
        System.out.println(cartao.toString()+"\n" +cartao.mostrarMensagem()+ "\n");

    }
}
