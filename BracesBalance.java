import java.util.Stack;

public class BracesBalance {
    public static void main(String[] args) {
         String braces = "{}{";
        boolean ans = checkString(braces);
        if(ans) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }

    }

    private static boolean checkString(String braces) {
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < braces.length(); i++) {
            char b = braces.charAt(i);
            if(b == '{') {
                stk.push(b);
            } else if(b == '}' && !stk.isEmpty()) {
                stk.pop();
            } else {
                return false;
            }
        }
        return stk.isEmpty();
    }


}
