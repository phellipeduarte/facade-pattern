public class Estruturacao extends EtapaProducao{

    private static Estruturacao estruturacao = new Estruturacao();

    public Estruturacao() {};

    public static Estruturacao getInstance(){ return estruturacao; }
}
