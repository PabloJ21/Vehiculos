public class Moto extends Vehiculo {
    private CajaTransmision cajaTransmision;

    public Moto(String numMatricula, String marca, String modelo, int año, CajaTransmision cajaTransmision) {
        super(numMatricula, marca, modelo, año);
        this.cajaTransmision = cajaTransmision;
    }

    public CajaTransmision getCajaTransmision() {
        return cajaTransmision;
    }

    public void setCajaTransmision(CajaTransmision cajaTransmision) {
        this.cajaTransmision = cajaTransmision;
    }

    @Override
    public double calcularCostoReserva(double tarifaBase, int dias) {
        double costo = tarifaBase * dias;
        if (cajaTransmision == CajaTransmision.AUTOMATICA) {
            costo += 50;
        }
        return costo;
    }

    @Override
    public String toString() {
        return "Moto [numMatricula=" + numMatricula + ", cajaTransmision=" + cajaTransmision + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
    }
}
