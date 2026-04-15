package OrdenamientoBurbuja;

public class BubbleSort {
    public static void main(String[] args) {
         int[] nums = {5, 1, 4, 2, 8};
    }

    public static int[] BubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }

        }

        return arr;
    }
}
