import javax.swing.*;

public class Entrada_ejemplo02 {
    public static void main (String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        System.out.print("Tu nombre es "+ nombre +" y tu edad "+ edad);
    }
}
