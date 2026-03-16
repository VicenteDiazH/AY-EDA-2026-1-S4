public class Sintaxis {

    // Método que calcula el promedio de un arreglo de notas
    public static double calcularPromedio(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }

    // Sintaxis Método Main
    public static void main(String[] args) {

        // Sintaxis Print
        System.out.println("Sistema de Gestión de Notas");

        // Sintaxis Variables
        String nombre = "Benja";
        int edad = 20;
        int[] notas = { 70, 60, 50, 45, 70 }; // Notas del estudiante
        double promedio; // Variable para almacenar el promedio

        System.out.println("Estudiante: " + nombre);
        System.out.println("Edad: " + edad);

        promedio = calcularPromedio(notas);
        System.out.println("Promedio de notas: " + promedio);

        // Sintaxis if
        if (promedio >= 40) {
            System.out.println("PASASTE");
        } else {
            System.out.println("te lo echaste TT");
        }

        // Sintaxis for
        System.out.println("Detalle de notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // Sintaxis while
        int intentos = 0;
        while (intentos < 3) {
            System.out.println("¡TU PUEDESSS, " + nombre + "!");
            intentos++;
        }
    }
}
