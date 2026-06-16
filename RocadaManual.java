package sprint2;




public class RocadaManual extends IntervencaoOperacional {

    public RocadaManual(String equipeResponsavel) {
        super(equipeResponsavel);
    }

    @Override
    public String executarServico(TrechoRodovia trecho) {
        trecho.setAlturaVegetacaoCm(10);

        return "Roçada manual executada pela " + getEquipeResponsavel() +
                ". Serviço indicado por segurança ou acesso difícil.";
    }
}