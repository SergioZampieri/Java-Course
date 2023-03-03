package poo;

public class Pruebas {
    public static void main (String[] args) {
        Empleados Trabajador1 = new Empleados("Carlos");
        Empleados Trabajador2 = new Empleados("Jose");
        Empleados Trabajador3 = new Empleados("Juan");
        System.out.println(Trabajador1.getDatos());
        System.out.println(Trabajador2.getDatos());
        Trabajador3.cambiaSeccion("Ventas");
        System.out.println(Trabajador3.getDatos());
       System.out.print( Empleados.getIdStatic());
    }
}
class Empleados {
    public Empleados (String _nombre){
        nombre=_nombre;
        seccion = "Administracion";
        id=idAux;
        idAux++;

    }
    public void cambiaSeccion (String seccion){

        this.seccion = seccion;
    }
    public String getDatos() {
        return id + "  "+ nombre + ": "+seccion ;
    }

    public static String getIdStatic(){
        return "el id estatico es: "+ idAux;
    }
    private static int idAux=1;
    private int id;
    private final String nombre;
    private String seccion;

}

