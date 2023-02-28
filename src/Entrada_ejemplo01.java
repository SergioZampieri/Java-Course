import java.util.Scanner;

public class Entrada_ejemplo01 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre");
        String nombre = entrada.nextLine();
        System.out.print("Introduce tu edad");
        int edad = entrada.nextInt();

        System.out.print("Hola, " + nombre + "en un año tendras " + (edad +1) +" años." );
    }
}
