package sprint2;

public class TesteManualIoT {
    public static void main(String[] args) {
        MonitoravelViaIoT sensorMock = new MockSensorIoT(82.5);
        double leitura = sensorMock.transmitirDadosSensor();

        System.out.println("Leitura capturada pelo mock IoT: " + leitura + " cm");
    }
}