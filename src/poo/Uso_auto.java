package poo;

public class Uso_auto {
    public static void main (String[] args) {
        Auto Peugeot = new Auto();
        Peugeot.setColor("amarillo");
        Peugeot.asientos_cuero(false);
        System.out.println(Peugeot.getDatosGenerales());
        System.out.println(Peugeot.getAsientos_cuero());
    }
}
