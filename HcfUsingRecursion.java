public class HcfUsingRecursion {
    public static void main(String[] args) {
        System.out.println(hcf(20, 80));
    }

    private static int hcf(int num1, int num2) {
        if(num2 == 0) return num1;
        else return hcf(num2, num1 % num2);
    }
}
