public class MaxMiniUsingRecursion {
    public static void main(String[] args) {
        int[] array = {1,9,2,3};
        int n = array.length;
        System.out.println(max(array, n));
        System.out.println(min(array, n));
    }


    private static int max(int[] arr, int n) {
        if(n == 1) return arr[0];
        return Math.max(arr[n-1], max(arr, n-1));

    }
    private static int min(int[] arr, int n) {
        if(n == 1) return arr[0];
        return Math.min(arr[n-1], min(arr, n-1));

    }

}
