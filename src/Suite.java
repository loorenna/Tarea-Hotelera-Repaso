public class Suite extends  Habitacion{
    private String jacuzzi;
    private String servicioPremium;
    private  String clienteFrecuente;
    public Suite(String jacuzzi,String servicioPremium,String clienteFrecuente,String codigo,String nombre,String tipoHabitacion,int numeroNoches,String disponible){
        super(codigo,nombre,tipoHabitacion,80,numeroNoches,disponible);
        this.jacuzzi=jacuzzi;
        this.servicioPremium=servicioPremium;
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
        double recargoJacuzzi;
        if (jacuzzi.equalsIgnoreCase("si")){
            recargoJacuzzi=16;
        }else {
            recargoJacuzzi=0;
        }
        double recargoServ;
        if (servicioPremium.equalsIgnoreCase("Room service")){
            recargoServ=18;
        } else if (servicioPremium.equalsIgnoreCase("Lavandería")) {
            recargoServ=24;
        } else if (servicioPremium.equalsIgnoreCase("Parqueadero")) {
            recargoServ=14;
        }else {
            recargoServ=0;
        }
        return  recargoJacuzzi+recargoServ;
    }
    @Override
    public double calcularHospedaje(){
        return getTarifaBase()*getNumeroNoches();
    }
    @Override
    public void mostrarDetalle() {
        System.out.println("--------------SUITE----------------");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Tipo de habitación: "+getTipoHabitacion());
        System.out.println("Tarifa Base: " + getTarifaBase());
        System.out.println("Número de noches: " + getNumeroNoches());
        System.out.println("Jacuzzi: " + jacuzzi);
        System.out.println("Servicio premium: " + servicioPremium);
        System.out.println("Cliente frecuente: " + clienteFrecuente);
    }
    @Override
    public void generarFactura(){
        System.out.println("-------------FACTURA-------------");
        double subtotal=calcularPago();
        double descuentos=subtotal*(calcularDescuento()/100);
        double recargos=subtotal*(calcularRecargo()/100);
        double totalBase=calcularPago(descuentos,recargos);
        double iva = totalBase * 0.15;
        double total= totalBase+iva;
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Iva: "+iva);
        System.out.println("Descuento: "+descuentos);
        System.out.println("Regargo: "+recargos);
        System.out.println("Total: "+total);

    }
}
