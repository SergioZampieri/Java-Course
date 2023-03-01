package poo;

public class Auto {
    private int ruedas;
   private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_final;
    private boolean asientos_cuero, climatizador;
    public Auto(){
        ruedas = 4;
        largo = 2000;
        ancho = 1500;
        motor=1600;
        peso_plataforma= 500;

    }
    public String getDatosGenerales() {
        return "La plataforma mide " + largo +"cm x " +ancho+"cm con motor "+ motor +"cc y un peso de  "+peso_plataforma+"kg";
    }
    public void setColor(String str){
        color = str;
    }
    public String getColor() {
        return "El color es: " + color;
    }
    public void  asientos_cuero(Boolean asientos_cuero) {
        this.asientos_cuero = asientos_cuero;
    }
    public String getAsientos_cuero() {
        if (asientos_cuero == true) {return "El auto tiene asientos de cuero";}
        else {return "El auto tiene no asientos de cuero";}
    }
}
