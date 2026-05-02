public class HabitacionFamiliar extends Habitacion {
    public int capacidadPersonas;
    public double descuentoFamiliar;
    private String clienteFrecuente;

    public HabitacionFamiliar(int capacidadPersonas, double descuentoFamiliar, String clienteFrecuente, String codigo, String nombre, String tipoHabitacion, int numeroNoches, String disponible) {
        super(codigo, nombre, tipoHabitacion, 60, numeroNoches, disponible);
        this.capacidadPersonas = capacidadPersonas;
        this.descuentoFamiliar = descuentoFamiliar;
        this.clienteFrecuente = clienteFrecuente;
    }

    public double calcularDescuento() {
        double descuentoC;
        if (clienteFrecuente.equalsIgnoreCase("si")) {
            descuentoC = 5;
        }else {
            descuentoC=0;
        }
        double descuentoNum;
        if (getNumeroNoches() > 5) {
            descuentoNum = 10;
        }else {
            descuentoNum=0;
        }
        return descuentoC + descuentoNum + descuentoFamiliar;
    }

    @Override
    public double calcularHospedaje() {
        double pago = getTarifaBase() * getNumeroNoches();
        return pago;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("--------HABITACION FAMILIAR--------");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo de habitación: " + getTipoHabitacion());
        System.out.println("Tarifa Base: " + getTarifaBase());
        System.out.println("Número de noches: " + getNumeroNoches());
        System.out.println("Cantidad de persona: " + capacidadPersonas);
        System.out.println("Descuento Familiar: " + descuentoFamiliar);
        System.out.println("Cliente frecuente: " + clienteFrecuente);
    }

    @Override
    public void generarFactura() {
        System.out.println("-------------FACTURA-------------");
        double subtotal = calcularPago();
        double descuentos = subtotal * (calcularDescuento() / 100);
        double totalBase = calcularPago(descuentos);
        double iva = totalBase * 0.15;
        double total = totalBase + iva;
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Iva: " + iva);
        System.out.println("Descuento: " + descuentos);
        System.out.println("Total: " + total);

    }
}

