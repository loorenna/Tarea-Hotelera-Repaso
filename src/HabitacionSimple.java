public class HabitacionSimple extends Habitacion{
    private String desayunoIncluido;
    private double costoServicioBasico;
    private  String clienteFrecuente;
    public HabitacionSimple(String desayunoIncluido,double costoServicioBasico,String clienteFrecuente,String codigo,String nombre,String tipoHabitacion,int numeroNoches,String disponible){
        super(codigo, nombre, tipoHabitacion, 35, numeroNoches, disponible);
        this.desayunoIncluido=desayunoIncluido;
        this.costoServicioBasico=costoServicioBasico;
        this.clienteFrecuente=clienteFrecuente;
    }
    public double calcularDescuento(){
        double descuentoC;
        if (clienteFrecuente.equalsIgnoreCase("si")){
            descuentoC=5;
        }else {
            descuentoC=0;
        }
        double descuentoNum;
        if (getNumeroNoches()>5){
            descuentoNum=10;
        }else {
            descuentoNum=0;
        }
        return descuentoC+descuentoNum;
    }
    public double calcularRecargo(){
        double recargoDesayuno;
        if (desayunoIncluido.equalsIgnoreCase("si")){
            recargoDesayuno=30;
        }else {
            recargoDesayuno=0;
        }
        return recargoDesayuno;
    }
    @Override
    public double calcularHospedaje(){
        return getTarifaBase()*getNumeroNoches();
    }
    @Override
    public  void mostrarDetalle(){
        System.out.println("--------------HABITACIÓN SIMPLE----------------");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Tipo de habitación: "+getTipoHabitacion());
        System.out.println("Tarifa Base: " + getTarifaBase());
        System.out.println("Número de noches: " + getNumeroNoches());
        System.out.println("Costo servicio básico: " + costoServicioBasico);
        System.out.println("Desayuno incluido: " + desayunoIncluido);
        System.out.println("Cliente frecuente: " + clienteFrecuente);
    }
    @Override
    public  void generarFactura(){
        double subtotal=calcularPago();
        double descuentos=subtotal*(calcularDescuento()/100);
        double recargos=subtotal*(calcularRecargo()/100);
        double totalBase= calcularPago(descuentos,recargos)+costoServicioBasico;
        double iva = totalBase * 0.15;
        double total=totalBase+iva;
        System.out.println("-----------FACTURA-----------");
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Descuento: "+descuentos);
        System.out.println("Recargo:"+recargos);
        System.out.println("Iva: "+iva);
        System.out.println("Total final: "+total);
    }

}
