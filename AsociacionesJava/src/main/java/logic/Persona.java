package logic;

public class Persona {
    private String nombre;
    private Animal mascota;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public void setMascota(Animal mascota) {
        this.mascota = mascota;
    }
    public String presentarMascota() {
        if (mascota != null) {
            return nombre + " tiene una mascota llamada " + mascota.nombre + ".";
        } else {
            return nombre + " no tiene mascota.";
        }
    }
} 