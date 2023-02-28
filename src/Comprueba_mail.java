import javax.swing.*;

public class Comprueba_mail {
    public static void main(String[] args) {
        boolean arroba = false;
        String mail = JOptionPane.showInputDialog("Introduce el mail");
        for (int i=0; i<mail.length(); i++){
            if (mail.charAt(i) == '@'){
                arroba = true;
            }
        }
        if (arroba==true){
            System.out.print("El mail es correcto");
        }
    }
}
