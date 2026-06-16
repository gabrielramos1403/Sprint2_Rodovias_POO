package sprint2;





public abstract class IntervencaoOperacional {
    private String equipeResponsavel;

    public IntervencaoOperacional(String equipeResponsavel) {
        setEquipeResponsavel(equipeResponsavel);
    }

    
    
    
    public abstract String executarServico(TrechoRodovia trecho);

    public String getEquipeResponsavel() {
        return equipeResponsavel;
    }

    public void setEquipeResponsavel(String equipeResponsavel) {
        if (equipeResponsavel != null && !equipeResponsavel.trim().isEmpty()) {
            this.equipeResponsavel = equipeResponsavel;
        } else {
            this.equipeResponsavel = "Equipe não definida";
        }
    }
}