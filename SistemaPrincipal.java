package sprint2;





public class SistemaPrincipal {
    public static void main(String[] args) {
        TrechoRodovia[] trechos = new TrechoRodovia[5];

        trechos[0] = new TrechoRodovia(
                10,
                11,
                "Trecho seco com boa visibilidade",
                "SECO",
                38,
                false,
                false
        );

        trechos[1] = new TrechoRodovia(
                12,
                13,
                "Trecho úmido próximo a mata",
                "UMIDO",
                55,
                false,
                false
        );

        trechos[2] = new TrechoRodovia(
                14,
                15,
                "Trecho com placa de sinalização",
                "UMIDO",
                75,
                true,
                false
        );

        trechos[3] = new TrechoRodoviaIoT(
                16,
                17,
                "Trecho com sensor IoT instalado",
                "UMIDO",
                68,
                false,
                false,
                "IOT-016"
        );

        trechos[4] = new TrechoRodovia(
                18,
                19,
                "Trecho de acostamento com acesso difícil",
                "SECO",
                92,
                false,
                true
        );

        System.out.println("SISTEMA DE MONITORAMENTO DE VEGETAÇÃO EM RODOVIAS");
        System.out.println("Simulando crescimento da vegetação por 7 dias...");

        for (TrechoRodovia trecho : trechos) {
            trecho.simularCrescimento(7);
        }

        MotorRegrasPrioridade motor = new MotorRegrasPrioridade();

        motor.atualizarTrechosComIoT(trechos);
        motor.gerarRelatorioPrioridade(trechos);
    }
}