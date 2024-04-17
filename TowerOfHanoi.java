public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;

        towerOfHanoi(n, 'A', 'B', 'C');
    }
    public static void towerOfHanoi(int n, char from, char mid, char to) {
        if (n == 0) return;
        towerOfHanoi(n-1, from, to , mid);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n-1, mid, from , to);
    }
}
