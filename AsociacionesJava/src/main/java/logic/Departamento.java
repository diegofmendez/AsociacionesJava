package logic;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Persona> empleados;
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Persona persona) {
        empleados.add(persona);
    }
    public String listarEmpleados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados del departamento ").append(nombre).append(": ");
        for (Persona p : empleados) {
            sb.append(presentarEmpleado(p)).append("; ");
        }
        return sb.toString();
    }
    private String presentarEmpleado(Persona p) {
        return p.presentarMascota();
    }
} 