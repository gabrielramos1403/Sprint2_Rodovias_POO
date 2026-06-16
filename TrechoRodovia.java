package sprint2;





public class TrechoRodovia {
    private int kmInicial;
    private int kmFinal;
    private String descricao;
    private String tipoAmbiente; // UMIDO ou SECO
    private double alturaVegetacaoCm;
    private boolean areaSinalizacao;
    private boolean acessoDificil;

    
    
    
    
    public TrechoRodovia(int kmInicial, int kmFinal, String descricao, String tipoAmbiente,
                         double alturaVegetacaoCm, boolean areaSinalizacao, boolean acessoDificil) {
        setKmInicial(kmInicial);
        setKmFinal(kmFinal);
        setDescricao(descricao);
        setTipoAmbiente(tipoAmbiente);
        setAlturaVegetacaoCm(alturaVegetacaoCm);
        this.areaSinalizacao = areaSinalizacao;
        this.acessoDificil = acessoDificil;
    }

 
    
    
    
    
    
    public void simularCrescimento(int dias) {
        if (dias <= 0) {
            System.out.println("Quantidade de dias inválida para o trecho KM " + kmInicial + ".");
            return;
        }

        double crescimentoPorDia;

        if (tipoAmbiente.equalsIgnoreCase("UMIDO")) {
            crescimentoPorDia = 1.8;
        } else {
            crescimentoPorDia = 0.8;
        }

        alturaVegetacaoCm += crescimentoPorDia * dias;
    }

    public String obterIdentificacao() {
        return "KM " + kmInicial + " ao KM " + kmFinal + " - " + descricao;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        if (kmInicial >= 0) {
            this.kmInicial = kmInicial;
        } else {
            this.kmInicial = 0;
        }
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        if (kmFinal >= this.kmInicial) {
            this.kmFinal = kmFinal;
        } else {
            this.kmFinal = this.kmInicial + 1;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.trim().isEmpty()) {
            this.descricao = descricao;
        } else {
            this.descricao = "Trecho sem descrição";
        }
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        if (tipoAmbiente != null && tipoAmbiente.equalsIgnoreCase("UMIDO")) {
            this.tipoAmbiente = "UMIDO";
        } else {
            this.tipoAmbiente = "SECO";
        }
    }

    public double getAlturaVegetacaoCm() {
        return alturaVegetacaoCm;
    }

    public void setAlturaVegetacaoCm(double alturaVegetacaoCm) {
        if (alturaVegetacaoCm >= 0) {
            this.alturaVegetacaoCm = alturaVegetacaoCm;
        } else {
            this.alturaVegetacaoCm = 0;
        }
    }

    public boolean isAreaSinalizacao() {
        return areaSinalizacao;
    }

    public boolean isAcessoDificil() {
        return acessoDificil;
    }
}