package logic;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String nombre;
    private List<Habitacion> habitaciones;
    public Casa(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }
    public void construirHabitacion(String nombreHabitacion) {
        habitaciones.add(new Habitacion(nombreHabitacion));
    }
    public String listarHabitaciones() {
        StringBuilder sb = new StringBuilder();
        sb.append("Habitaciones de ").append(nombre).append(": ");
        for (Habitacion h : habitaciones) {
            sb.append(h.getNombre()).append("; ");
        }
        return sb.toString();
    }
    // Clase interna para composición
    private class Habitacion {
        private String nombre;
        public Habitacion(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return nombre;
        }
    }
} 