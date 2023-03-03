package poo;

public class Uso_vehiculo {
    public static void main (String[] args) {
        Auto peugeot = new Auto();
        peugeot.setColor("amarillo");
        Furgoneta sprinter = new Furgoneta(7, 880);
        sprinter.asientos_cuero(false);
        sprinter.setColor("blanca");
        System.out.println(peugeot.getDatosGenerales() +" "+peugeot.getColor()+" "+peugeot.getAsientos_cuero());
        System.out.println(sprinter.getDatosGenerales() +" "+sprinter.getColor()+" "+sprinter.getDatosFurgoneta());


    }

}
