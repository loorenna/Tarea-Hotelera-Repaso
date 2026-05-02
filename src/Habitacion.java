abstract class Habitacion {
    private String codigo;
    private String nombre;
    private String tipoHabitacion;
    private double tarifaBase;
    private int numeroNoches;
    private String disponible;
    public Habitacion(String codigo,String nombre,String tipoHabitacion,double tarifaBase,int numeroNoches,String disponible){
        setNombre(nombre);
        setCodigo(codigo);
        setTipoHabitacion(tipoHabitacion);
        setTarifaBase(tarifaBase);
        setNumeroNoches(numeroNoches);
        setDisponible(disponible);
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }else {
            System.out.println("Nombre invalido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        if (codigo!=null && !codigo.isBlank()) {
            this.codigo = codigo;
        }else {
            System.out.println("Codigo invalido");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        if (tipoHabitacion!=null && !tipoHabitacion.isBlank()) {
            this.tipoHabitacion = tipoHabitacion;
        }else {
            System.out.println("Tipo invalido");
        }
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTarifaBase(double tarifaBase) {
        if (tarifaBase>0) {
            this.tarifaBase = tarifaBase;
        }else {
            System.out.println("Tarifa no valida");
        }
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setNumeroNoches(int numeroNoches) {
        if (numeroNoches>0) {
            this.numeroNoches = numeroNoches;
        }else {
            System.out.println("Numero de noches no valido");
        }
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setDisponible(String disponible) {
        if (disponible.equalsIgnoreCase("si")||disponible.equalsIgnoreCase("no")) {
            this.disponible = disponible;
        }
    }

    public String getDisponible() {
        return disponible;
    }
    public double calcularPago(){
        return calcularHospedaje();
    }

    public double calcularPago(double descuento){
        return calcularHospedaje()-descuento;
    }
    public double calcularPago(double descuento,double recargo){
        return calcularHospedaje()-descuento+recargo;
    }
    public abstract double calcularHospedaje();
    public  abstract void mostrarDetalle();
    public boolean verificarDisponibilidad(){
        return disponible.equalsIgnoreCase("si");
    }
    public abstract void generarFactura();
    public void registrarReserva(){
        System.out.println("Reserva registrada");
    }
}
