package sprint2;




public class RocadaMecanizada extends IntervencaoOperacional {

    public RocadaMecanizada(String equipeResponsavel) {
        super(equipeResponsavel);
    }

    @Override
    public String executarServico(TrechoRodovia trecho) {
        trecho.setAlturaVegetacaoCm(8);

        return "Roçada mecanizada executada pela " + getEquipeResponsavel() +
                ". Vegetação reduzida para 8 cm.";
    }
}