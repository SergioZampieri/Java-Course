import javax.swing.*;

public class Bucles {
    public static void main (String[] args){
        String clave = "Juan";
        String pass = "";
        while (clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("Introduce la contraseña correcta");
            if (clave.equals(pass)==false){
                System.out.print("contraseña incorrecta");
            }

        }
        System.out.print("contraseña correcta");
    }
}
