public class recursion {

    public static void contar(int n) {
        System.out.println("Estoy en contar(" + n + ")");

        if (n == 0) {
            System.out.println("Fin de la recursión");
            return;
        }

        contar(n - 1); // la función se llama sola

        System.out.println("Volviendo a contar(" + n + ")");
    }

    public static void main(String[] args) {
        contar(3);
    }
}