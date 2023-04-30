public class CarroFacade {

    public static boolean verificarCarroPronto(Carro carro){

        if(Estruturacao.getInstance().verificarCarroDefeito(carro)){
            return false;
        }
        if(Montagem.getInstance().verificarCarroDefeito(carro)) {
            return false;
        }
        if(Pintura.getInstance().verificarCarroDefeito(carro)){
            return false;
        }
        return true;
    }


}
