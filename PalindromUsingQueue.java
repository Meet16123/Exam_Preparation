import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromUsingQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:  ");
        String str = sc.next().toLowerCase();

        Queue qu = new LinkedList();

        for (int i = str.length()-1; i >= 0; i--) {
            qu.add(str.charAt(i));
        }

        String reverse = "";
        while (!qu.isEmpty()) {
            reverse = reverse + qu.remove();
        }

        if(reverse.toLowerCase().equals(str)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
