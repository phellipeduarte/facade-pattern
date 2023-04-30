import java.util.ArrayList;
import java.util.List;

public abstract class EtapaProducao {

    private List<Carro> carrosComDefeito = new ArrayList<Carro>();

    public void addCarroDefeito(Carro carro){ this.carrosComDefeito.add(carro); }

    public boolean verificarCarroDefeito(Carro carro){ return this.carrosComDefeito.contains(carro); }

}
