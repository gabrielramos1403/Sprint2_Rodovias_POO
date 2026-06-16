package sprint2;

import java.util.Random;





public class TrechoRodoviaIoT extends TrechoRodovia implements MonitoravelViaIoT {
    private String codigoSensor;
    private Random random;

    public TrechoRodoviaIoT(int kmInicial, int kmFinal, String descricao, String tipoAmbiente,
                            double alturaVegetacaoCm, boolean areaSinalizacao, boolean acessoDificil,
                            String codigoSensor) {
        super(kmInicial, kmFinal, descricao, tipoAmbiente, alturaVegetacaoCm, areaSinalizacao, acessoDificil);
        this.codigoSensor = codigoSensor;
        this.random = new Random();
    }

    @Override
    public double transmitirDadosSensor() {
       
    	
    	
        double variacao = random.nextDouble() * 10;
        double leituraSensor = getAlturaVegetacaoCm() + variacao;
        setAlturaVegetacaoCm(leituraSensor);
        return leituraSensor;
    }

    public String getCodigoSensor() {
        return codigoSensor;
    }
}