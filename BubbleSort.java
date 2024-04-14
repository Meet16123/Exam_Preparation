import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,2,7,1};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
    public static int[] bubbleSort(int[] array) {
       for(int i = 0; i < array.length; i++) {
           for(int j = 0; j < array.length-1; j++) {
               if(array[j] > array[j+1]) {
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
           }
       }
        return array;
    }

    //Time Complexity => O(n)^2
}
