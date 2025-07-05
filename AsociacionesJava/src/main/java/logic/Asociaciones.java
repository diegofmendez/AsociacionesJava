package logic;

public class Asociaciones {

    public static void main(String[] args) {
        System.out.println("Ejemplo de asociaciones en Java:\n");
        // Herencia
        Perro perro = new Perro("Firulais");
        System.out.println(perro.hablar());
        // Asociación simple
        Persona persona = new Persona("Ana");
        persona.setMascota(perro);
        System.out.println(persona.presentarMascota());
        // Agregación
        Departamento departamento = new Departamento("Sistemas");
        departamento.agregarEmpleado(persona);
        System.out.println(departamento.listarEmpleados());
        // Composición
        Casa casa = new Casa("Casa Azul");
        casa.construirHabitacion("Habitación Principal");
        System.out.println(casa.listarHabitaciones());
    }
}
