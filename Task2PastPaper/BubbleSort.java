
public class BubbleSort {

    private int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean isSorted;

        for(int i=0; i < n; i++) {
            //habba l passes
            isSorted = true;
            for(int j=1; j < (n-i); j++) {
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted == true) break;
        }
        return arr;
    }

    private float[] bubbleSort(float[] arr) {
        int n = arr.length;
        float temp = 0;
        boolean isSorted;
        for(int i=0; i < n; i++) {
            isSorted = true;
            for(int j=1; j < (n-i); j++) {
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted == true) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {9, 4, 7, 1, 3};
        float arr_float[] = {3.2f, 1.7f, 44.3f, 22.9f,17.4f};
        BubbleSort bs = new BubbleSort ();
        arr = bs.bubbleSort(arr);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        arr_float = bs.bubbleSort(arr_float);
        for(int i=0; i < arr_float.length; i++){
            System.out.print(arr_float[i] + " ");
        }

    }

}