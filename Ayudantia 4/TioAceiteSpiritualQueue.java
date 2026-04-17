// Clase Queue
class Queue {
    private Node front;
    private Node tail;

    public Queue() {
        this.front = null;
        this.tail = null;
    }

    // Insertar al final de la cola
    public void enqueue(String clientName) {
        Node toInsertNode = new Node(clientName);
        if (isEmpty()) {
            this.front = toInsertNode;
            this.tail = toInsertNode;
        } else {
            this.tail.setNext(toInsertNode);
            this.tail = toInsertNode;
        }
    }

    // Eliminar del frente de la cola
    public String dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            String clientToDequeue = this.front.getClientName();
            this.front = this.front.getNext();
            if (this.front == null) {
                this.tail = null;
            }
            return clientToDequeue;
        }
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    // Imprimir la cola completa
    public void print() {
        Node aux = this.front;
        int counter = 1;
        while (aux != null) {
            System.out.println("#" + counter + " --> " + aux.getClientName());
            aux = aux.getNext();
            counter++;
        }
        if (counter == 1) {
            System.out.println("La fila está vacía ✨🕊️✨");
        } else {
            System.out.println("null");
        }
    }

    // Nodo interno
    private class Node {
        private String clientName;
        private Node next;

        public Node(String clientName) {
            this.clientName = clientName;
        }

        public String getClientName() {
            return clientName;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

public class TioAceiteSpiritualQueue {
    public static void main(String[] args) {
        Queue filaPedidos = new Queue();

        System.out.println("🌀 Bienvenido al Tío Aceite Espiritual 🌀");
        System.out.println("Llegan los clientes místicos a la fila...\n");

        filaPedidos.enqueue("Aura de Fuego");
        filaPedidos.enqueue("Chakra Desalineado");
        filaPedidos.enqueue("Cometa Lunar");
        filaPedidos.enqueue("Mercurio Retrógrado");

        System.out.println("\n📜 Fila actual de clientes:");
        filaPedidos.print();

        System.out.println("\n✨ Atendiendo al primer cliente (dequeue): " + filaPedidos.dequeue());

        System.out.println("\n📜 Fila actual después de atender al primero:");
        filaPedidos.print();

        System.out.println("\n¿La fila está vacía? " + filaPedidos.isEmpty());

        System.out.println("\n✨ Atendiendo a los siguientes clientes:");
        filaPedidos.dequeue();
        filaPedidos.dequeue();
        filaPedidos.dequeue(); // Aquí debería quedar vacía

        System.out.println("\n¿La fila está vacía ahora? " + filaPedidos.isEmpty());
        filaPedidos.print();
    }
}
