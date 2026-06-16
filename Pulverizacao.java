package sprint2;




public class Pulverizacao extends IntervencaoOperacional {

    public Pulverizacao(String equipeResponsavel) {
        super(equipeResponsavel);
    }

    @Override
    public String executarServico(TrechoRodovia trecho) {
        double novaAltura = trecho.getAlturaVegetacaoCm() - 5;
        trecho.setAlturaVegetacaoCm(novaAltura);

        return "Pulverização preventiva executada pela " + getEquipeResponsavel() +
                ". Crescimento da vegetação controlado.";
    }
}