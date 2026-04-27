import java.util.Scanner;

public class Main {

    static boolean binarySearch(int[] arr, int target){
        int low = 0, high= arr.length-1;
        int steps = 0;

        System.out.println("\n--- Búsqueda Binaria ---");

        while (low <= high) {
            steps++;
            int mid = (low + high)/2;

            System.out.println("Paso " + steps + 
                " -> low: " + low + 
                ", high: " + high + 
                ", mid: " + mid + 
                ", valor: " + arr[mid]);

            if(arr[mid] == target){
                System.out.println("Encontrado en índice " + mid);
                System.out.println("Pasos (binaria): " + steps);
                return true;
            }else if(arr[mid] > target){
                high = mid-1;
            } else{
                low = mid + 1;
            }
        }

        System.out.println("No encontrado");
        System.out.println("Pasos (binaria): " + steps);
        return false;
    }

    static boolean linearSearch(int[] arr, int target){
        int steps = 0;

        System.out.println("\n--- Búsqueda Lineal ---");

        for(int i = 0; i < arr.length; i++){
            steps++;
            System.out.println("Paso " + steps + 
                " -> índice: " + i + 
                ", valor: " + arr[i]);

            if(arr[i] == target){
                System.out.println("Encontrado en índice " + i);
                System.out.println("Pasos (lineal): " + steps);
                return true;
            }
        }

        System.out.println("No encontrado");
        System.out.println("Pasos (lineal): " + steps);
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = Util.generateRandomArray(10);

        System.out.println("\nArreglo original:");
        for(int i = 0; i < A.length ; i++){
            System.out.println("#"+ i + " -> " + A[i]);
        }

        // Menú de ordenamiento
        System.out.println("\nElige algoritmo de ordenamiento:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");

        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
                Sorting.bubbleSort(A, A.length);
                break;
            case 2:
                Sorting.selectionSort(A, A.length);
                break;
            case 3:
                Sorting.insertionSort(A, A.length);
                break;
            case 4:
                Sorting.mergeSort(A, 0, A.length - 1);
                break;
            case 5:
                Sorting.quickSort(A, 0, A.length - 1);
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("\nArreglo ordenado:");
        for(int i = 0; i < A.length ; i++){
            System.out.println("#"+ i + " -> " + A[i]);
        }

        // Búsqueda
        System.out.println("\nIngresa número a buscar:");
        int target = sc.nextInt();

        // Ejecutar ambas búsquedas
        binarySearch(A, target);
        linearSearch(A, target);

        sc.close();
    }
}