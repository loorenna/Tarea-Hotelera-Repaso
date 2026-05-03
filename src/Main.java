import  java.util.Scanner;
import java.util.ArrayList;
import  java.util.List;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Habitacion> reserva=new ArrayList<>();
        String opcion;
        do {
            System.out.println("Ingrese el codigo: ");
            String codigo= sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombre= sc.nextLine();
            System.out.println("Tipo de habitación (simple/suite/familiar): ");
            String tipo=sc.nextLine();
            System.out.println("Número de noches: ");
            int numero=sc.nextInt();
            sc.nextLine();
            System.out.println("Está disponible (si/no): ");
            String dispo=sc.nextLine();
            System.out.println("Es cliente frecuente (si/no): ");
            String cliente=sc.nextLine();
            Habitacion hab=null;
            if (tipo.equalsIgnoreCase("simple")){
                System.out.println("Desayuno incluido (si/no): ");
                String desayuno=sc.nextLine();
                System.out.println("Costo de servicio básico: ");
                double costoServicio=sc.nextDouble();
                sc.nextLine();
                hab=new HabitacionSimple(desayuno,costoServicio,cliente,codigo,nombre,tipo,numero,dispo);
            } else if (tipo.equalsIgnoreCase("suite")) {
                System.out.println("Jacuzzi (si/no): ");
                String jacuzzi=sc.nextLine();
                System.out.println("Servicio premium (Room service/Lavandería/Parqueadero): ");
                String servicio=sc.nextLine();
                hab=new Suite(jacuzzi,servicio,cliente,codigo,nombre,tipo,numero,dispo);
            }else {
                System.out.println("Cantidad de personas: ");
                int cant=sc.nextInt();
                sc.nextLine();
                System.out.println("Descuento familiar: ");
                double desc=sc.nextDouble();
                sc.nextLine();
                hab=new HabitacionFamiliar(cant,desc,cliente,codigo,nombre,tipo,numero,dispo);
            }
            hab.setNumeroNoches(hab.getNumeroNoches() + 1);
            hab.setTarifaBase(hab.getTarifaBase() + 5);
            if (hab.verificarDisponibilidad()){
                hab.registrarReserva();
                reserva.add(hab);
            }else {
                System.out.println("Habitación no disponible");
            }
            System.out.println("Agregar otra reserva(si/no): ");
            opcion=sc.nextLine();
        }while (opcion.equalsIgnoreCase("si"));
        System.out.println("---------------REPORTE------------------");
        for (Habitacion r:reserva){
            r.mostrarDetalle();
            r.generarFactura();
            System.out.println("--------------------------------------------------");
        }

    }
}
