public class ProductOfTwoNumberUsingRecursion {
    public static void main(String[] args) {
        int x = 30, y = 3;
        System.out.println(product(x,y));
    }

    private static int product(int x, int y) {
        //base case
        if(x == 0 || y == 0) return 0;

//        recursive call
        int ans = product(x, y-1);

//        adding value
        return ans + x;
    }

}
