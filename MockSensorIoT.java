package sprint2;




public class MockSensorIoT implements MonitoravelViaIoT {
    private double valorSimulado;

    public MockSensorIoT(double valorSimulado) {
        this.valorSimulado = valorSimulado;
    }

    @Override
    public double transmitirDadosSensor() {
        return valorSimulado;
    }
}