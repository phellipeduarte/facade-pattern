public class Pintura extends EtapaProducao{

    private static Pintura pintura = new Pintura();

    public Pintura() {};

    public static Pintura getInstance(){ return pintura; }
}
