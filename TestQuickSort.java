import java.util.Random;

public class TestQuickSort {

    public static int[] generarArreglo(int n){
        Random rand = new Random();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(100000);
        }

        return arr;
    }

    public static void main(String[] args){

        int[] tamanos = {1000, 5000, 10000, 20000, 50000};

        for(int n : tamanos){

            int[] arr = generarArreglo(n);

            long inicio = System.nanoTime();

            QuickSortMiddlePivot.quickSort(arr, 0, arr.length - 1);

            long fin = System.nanoTime();

            long tiempo = fin - inicio;

            System.out.println("Tamaño: " + n + " Tiempo(ns): " + tiempo);
        }
    }
}
