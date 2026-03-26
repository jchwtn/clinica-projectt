public class PacienteEPS extends Paciente {

    String nombreEPS;

    public PacienteEPS() {
    }

    public PacienteEPS(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }

    public PacienteEPS(String nombre, int documento, double costoConsulta, String nombreEPS) {
        super(nombre, documento, costoConsulta);
        this.nombreEPS = nombreEPS;
    }

    public String getNombreEPS() {
        return nombreEPS;
    }

    public void setNombreEPS(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }

    @Override
    public String toString() {
        return "PacienteEPS{" +
                "nombreEPS='" + nombreEPS + '\'' +
                '}';
    }

    public double calcularCostoFinal() {

        double copago;
        if (costoConsulta == 300000){
            copago = aplicarRecargo(0.25);
        } else if (costoConsulta == 80000) {
            copago = aplicarRecargo(0.2);
        } else if (costoConsulta > 500000) {
            copago = aplicarDescuento(0.05);
        } else {
            copago = aplicarRecargo(0.3);
        }
        return copago;
    }
}
