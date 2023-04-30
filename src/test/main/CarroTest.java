import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroTest {

    @Test
    void deveRetornarDefeitoEstruturacao(){
        Carro carro = new Carro();
        Estruturacao.getInstance().addCarroDefeito(carro);

        assertEquals(false, carro.verificarPronto());
    }

    @Test
    void deveRetornarDefeitoMontagem(){
        Carro carro = new Carro();
        Montagem.getInstance().addCarroDefeito(carro);

        assertEquals(false, carro.verificarPronto());
    }

    @Test
    void deveRetornarDefeitoPintura(){
        Carro carro = new Carro();
        Pintura.getInstance().addCarroDefeito(carro);

        assertEquals(false, carro.verificarPronto());
    }

    @Test
    void deveRetornarCarroPronto(){
        Carro carro = new Carro();

        assertEquals(true, carro.verificarPronto());
    }
}
