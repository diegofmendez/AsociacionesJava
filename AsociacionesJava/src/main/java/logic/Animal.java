package logic;

public class Animal {
    protected String nombre;
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public String hablar() {
        return nombre + " hace un sonido.";
    }
} 