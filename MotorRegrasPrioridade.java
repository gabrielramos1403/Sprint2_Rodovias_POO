package sprint2;





public class MotorRegrasPrioridade {
    private IntervencaoOperacional rocadaMecanizada;
    private IntervencaoOperacional rocadaManual;
    private IntervencaoOperacional pulverizacao;

    
    
    
    public MotorRegrasPrioridade() {
        this.rocadaMecanizada = new RocadaMecanizada("Equipe Mecanizada A");
        this.rocadaManual = new RocadaManual("Equipe Manual B");
        this.pulverizacao = new Pulverizacao("Equipe Preventiva C");
    }

    
    
    
    public void atualizarTrechosComIoT(TrechoRodovia[] trechos) {
        System.out.println("\n--- ATUALIZAÇÃO AUTOMÁTICA VIA IoT ---");

        for (TrechoRodovia trecho : trechos) {
            if (trecho instanceof MonitoravelViaIoT) {
                double leitura = ((MonitoravelViaIoT) trecho).transmitirDadosSensor();

                System.out.println(trecho.obterIdentificacao() +
                        " | Leitura IoT: " + String.format("%.2f", leitura) + " cm");
            }
        }
    }

    
    
    
    
    
    public void gerarRelatorioPrioridade(TrechoRodovia[] trechos) {
        System.out.println("\n========== RELATÓRIO DE PRIORIDADE DE ROÇADA ==========");

        for (TrechoRodovia trecho : trechos) {
            IntervencaoOperacional intervencao = definirIntervencao(trecho);
            String prioridade = definirPrioridade(trecho);

            System.out.println("\nTrecho: " + trecho.obterIdentificacao());
            System.out.println("Ambiente: " + trecho.getTipoAmbiente());
            System.out.println("Altura da vegetação: " + String.format("%.2f", trecho.getAlturaVegetacaoCm()) + " cm");
            System.out.println("Prioridade: " + prioridade);

            if (intervencao == null) {
                System.out.println("Ação recomendada: Monitorar. Não precisa de intervenção imediata.");
            } else {
                System.out.println("Ação recomendada: " + intervencao.getClass().getSimpleName());
                System.out.println(intervencao.executarServico(trecho));
            }
        }

        System.out.println("\n=======================================================");
    }

    private IntervencaoOperacional definirIntervencao(TrechoRodovia trecho) {
        double altura = trecho.getAlturaVegetacaoCm();

        if (altura >= 70) {
            if (trecho.isAcessoDificil() || trecho.isAreaSinalizacao()) {
                return rocadaManual;
            }

            return rocadaMecanizada;
        }

        if (altura >= 45 && trecho.getTipoAmbiente().equalsIgnoreCase("UMIDO")) {
            return pulverizacao;
        }

        return null;
    }

    
    
    
    
    private String definirPrioridade(TrechoRodovia trecho) {
        double altura = trecho.getAlturaVegetacaoCm();

        if (altura >= 90) {
            return "CRÍTICA";
        }

        if (altura >= 70) {
            return "ALTA";
        }

        if (altura >= 45) {
            return "MÉDIA";
        }

        return "BAIXA";
    }
}