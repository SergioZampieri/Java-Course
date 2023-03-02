package poo;

public class Pruebas {
    public static void main (String[] args) {
        Empleados Trabajador1 = new Empleados("Carlos");
        Empleados Trabajador2 = new Empleados("Jose");
        Empleados Trabajador3 = new Empleados("Juan");
        System.out.println(Trabajador1.getNombreSeccion());
        System.out.println(Trabajador2.getNombreSeccion());
        Trabajador3.cambiaSeccion("Ventas");
        System.out.println(Trabajador3.getNombreSeccion());
    }
}
class Empleados {
    public Empleados (String _nombre){
        nombre=_nombre;
        seccion = "Administracion";

    }

    public void cambiaSeccion (String seccion){
        this.seccion = seccion;
    }

    public String getNombreSeccion() {
        return nombre + ": "+seccion ;
    }

    private final String nombre;
    private String seccion;

}

