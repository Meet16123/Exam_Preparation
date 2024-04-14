import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5,2,7,1};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
