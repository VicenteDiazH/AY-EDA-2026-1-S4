import java.util.*;

public class Biblioteca {
    public static void main(String[] args) {
        // Mapa de estudiante -> conjunto de libros devueltos
        Map<String, Set<String>> devoluciones = new HashMap<>();

        registrarDevolucion(devoluciones, "Benja", "Juramentada");
        registrarDevolucion(devoluciones, "Benja", "Guia de Redstone");
        registrarDevolucion(devoluciones, "Benja", "Guia de Redstone"); // No se repite

        registrarDevolucion(devoluciones, "Cata", "La granja de los animales");

        // Consultar si un estudiante devolvió un libro específico
        String estudiante = "Benja";
        String libro = "Guia de Redstone";
        if (devoluciones.containsKey(estudiante) && devoluciones.get(estudiante).contains(libro)) {
            System.out.println(estudiante + " ya devolvió el libro '" + libro + "'");
        }

        // Mostrar todos los libros devueltos por cada estudiante
        for (String alumno : devoluciones.keySet()) {
            System.out.println("Libros devueltos por " + alumno + ": " + devoluciones.get(alumno));
        }
    }

    static void registrarDevolucion(Map<String, Set<String>> devoluciones, String estudiante, String libro) {
        devoluciones.putIfAbsent(estudiante, new HashSet<>());
        boolean nuevo = devoluciones.get(estudiante).add(libro);
        if (nuevo) {
            System.out.println("Se registró la devolución de '" + libro + "' por " + estudiante);
        } else {
            System.out.println(estudiante + " ya había devuelto '" + libro + "' hoy.");
        }
    }
}
