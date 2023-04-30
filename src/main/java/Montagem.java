public class Montagem extends EtapaProducao{

    private static Montagem montagem = new Montagem();

    public Montagem() {};

    public static Montagem getInstance(){ return montagem; }
}
