public class PacienteParticular extends Paciente {

    double total;

    public PacienteParticular() {
    }

    public PacienteParticular(double total) {
        this.total = total;
    }

    public PacienteParticular(String nombre, int documento, double costoConsulta, double total) {
        super(nombre, documento, costoConsulta);
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PacienteParticular{" +
                "total=" + total +
                '}';
    }

    public double calcularCostoFinal() {
        if (costoConsulta == 400000){
            total = aplicarDescuento(0.15);
        } else if (costoConsulta == 200000) {
            total = aplicarDescuento(0.10);
        } else if (costoConsulta == 50000) {
            total = aplicarRecargo(0.05);
        }
        return total;
    }



}
