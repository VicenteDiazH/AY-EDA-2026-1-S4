import java.util.*;

class Paciente {
    String nombre;
    int prioridad; // 1 = más urgente, 5 = menos urgente
    int ordenLlegada;

    public Paciente(String nombre, int prioridad, int ordenLlegada) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.ordenLlegada = ordenLlegada;
    }

    public String toString() {
        return nombre + " (Prioridad: " + prioridad + ")";
    }
}

public class SalaUrgencias {
    public static void main(String[] args) {
        Comparator<Paciente> comparador = (a, b) -> {
            if (a.prioridad != b.prioridad) {
                return Integer.compare(a.prioridad, b.prioridad); // Menor prioridad = más urgente
            } else {
                return Integer.compare(a.ordenLlegada, b.ordenLlegada); // Orden de llegada
            }
        };

        PriorityQueue<Paciente> cola = new PriorityQueue<>(comparador);
        int llegada = 0;

        cola.add(new Paciente("Dante", 3, llegada++));
        cola.add(new Paciente("Liliana", 1, llegada++));
        cola.add(new Paciente("Mena", 2, llegada++));
        cola.add(new Paciente("Vixon", 1, llegada++));

        System.out.println("Próximo paciente en ser atendido: " + cola.peek());

        while (!cola.isEmpty()) {
            System.out.println("Atendiendo a: " + cola.poll());
        }
    }
}
