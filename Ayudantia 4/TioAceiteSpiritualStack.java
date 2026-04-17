// Clase Stack
class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(String item) {
        Node toInsertNode = new Node(item);
        toInsertNode.setNext(this.top);
        this.top = toInsertNode;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        } else {
            String topItem = this.top.getItem();
            this.top = this.top.getNext();
            return topItem;
        }
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return this.top.getItem();
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void print() {
        Node aux = this.top;
        int size = 0;

        // Calcular tamaño para numeración inversa
        while (aux != null) {
            size++;
            aux = aux.getNext();
        }

        aux = this.top;
        while (aux != null) {
            System.out.println("#" + size + " --> " + aux.getItem());
            aux = aux.getNext();
            size--;
        }

        if (this.top == null) {
            System.out.println("La bandeja está vacía 🕊️🌌");
        } else {
            System.out.println("null");
        }
    }

    // Nodo interno
    private class Node {
        private String item;
        private Node next;

        public Node(String item) {
            this.item = item;
        }

        public String getItem() {
            return item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

public class TioAceiteSpiritualStack {
    public static void main(String[] args) {
        Stack bandeja = new Stack();

        System.out.println("🔮 Bienvenido a la Bandeja Maldita del Papi Miki 🔮");
        System.out.println("Preparando completos chamánicos...\n");

        bandeja.push("Completo con palta vibracional");
        bandeja.push("Completo ascendente en Leo");
        bandeja.push("Pan pita de chakras invertidos");
        bandeja.push("Completo interdimensional sin gluten");

        System.out.println("📦 Bandeja actual (stack):");
        bandeja.print();

        System.out.println("\n👀 ¿Qué completo está arriba? (peek): " + bandeja.peek());

        System.out.println("\n🍽️ Entregando el primero de la pila (pop): " + bandeja.pop());

        System.out.println("\n📦 Bandeja después de entregar uno:");
        bandeja.print();

        System.out.println("\n¿La bandeja está vacía? " + bandeja.isEmpty());

        System.out.println("\n🍽️ Vaciando completamente la bandeja:");
        while (!bandeja.isEmpty()) {
            System.out.println("Entregado: " + bandeja.pop());
        }

        System.out.println("\n¿Está vacía ahora? " + bandeja.isEmpty());
        bandeja.print();
    }
}
