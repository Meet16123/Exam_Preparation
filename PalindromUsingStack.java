import java.util.Stack;

public class PalindromUsingStack {
    public static void main(String[] args) {
        String str = "Ramar";
        str = str.toLowerCase();
        Stack stk = new Stack();
        String newStr = "";
        for(int i = 0; i < str.length(); i++) {
            stk.push(str.charAt(i));
        }
        while(!stk.empty()) {
            newStr = newStr + stk.pop();
        }

        if(str.toLowerCase().equals(newStr)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
