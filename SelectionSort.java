import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] array = {5,2,7,1};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    //Time Complexity => O(n)^2
}
