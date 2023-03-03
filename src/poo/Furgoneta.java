package poo;

public class Furgoneta extends Auto{
    public Furgoneta(int plazas_extra, int capacidad_carga){
        super();
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;

    }
    public String getDatosFurgoneta(){
              return capacidad_carga + " " + plazas_extra;
    }
    private int capacidad_carga;
    private int plazas_extra;
}
