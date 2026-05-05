package OrdenamientoInsertion;

public class InsertionSort {
    static void main(String[] args) {
     int[] arr = {4,5,2,7,8};

    }

    static void insertionSort(int[] num){
        int n = num.length;
        // empezamos desde [1] porque asumimos que [0] ya esta ordenado
        for (int i = 1; i < n; i++) {
            int elemento = num[i];
            int j = i - 1;

            while (j >= 0 && num[j] > elemento) {
                num[j + 1] = num[j];
                j = j - 1;
            }

            num[j + 1]= elemento;
        }
    }

    static void imprimirArr(int[] num){
        System.out.print("[ ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
            if(i == num.length - 2){
                System.out.print(num[i]);
            }
        }
        System.out.print(" ]");
    }
}
