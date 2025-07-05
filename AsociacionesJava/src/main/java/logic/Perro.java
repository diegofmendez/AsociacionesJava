package logic;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public String hablar() {
        return nombre + " dice: Guau!";
    }
} 