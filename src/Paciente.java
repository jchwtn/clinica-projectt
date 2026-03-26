public abstract class Paciente {
    private String nombre;
    private int documento;
    protected double costoConsulta;


    //CONS VACIO
    public Paciente() {
    }

    //CONS LLENO
    public Paciente(String nombre, int documento, double costoConsulta) {
        this.nombre = nombre;
        this.documento = documento;
        this.costoConsulta = costoConsulta;
    }


    //GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }


    //TOSGTIRNG
    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }


    public abstract double calcularCostoFinal();

    public double aplicarDescuento(double porcentaje){
        double descuento = costoConsulta * porcentaje;
        return costoConsulta - descuento;
    }


    public double aplicarRecargo(double porcentaje){
        double recargo = costoConsulta * porcentaje;
        return costoConsulta + recargo;
    }

    public boolean esConsultaCostosa(){
        if(costoConsulta > 300000){
            return true;
        }else {
            return false;
        }
    }

    public void mostrarDatos(double costoFinal){
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Costo consulta: " + costoConsulta);
        System.out.println("Costo final: " + costoFinal);
    }
}
