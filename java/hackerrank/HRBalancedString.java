package hackerrank;

import java.util.Stack;

public class HRBalancedString {

    /*Problem : https://www.hackerrank.com/challenges/balanced-brackets/problem */

    public static void main(String[] args) {

        boolean isBalanced = false;

        java.util.Stack<Character> st = new Stack<>();

        String str = "{[(])}";

        if(str.length()%2 != 0  || str.isEmpty())
        {
            System.out.println("NO");
        }else {

            int len = str.length();
            for (int i = 0; i < len; i++) {
                char incomingBracket = str.charAt(i);

                if (incomingBracket == '[' || incomingBracket == '{' || incomingBracket == '(') {
                    st.push(incomingBracket);
                } else {
                    if (st.isEmpty()) {
                        isBalanced = false;
                        break;
                    }

                    char popedBreacket = st.pop();
                    isBalanced = checkBalance(incomingBracket, popedBreacket);

                    if(!isBalanced){
                        break;
                    }
                }
            }
            if (isBalanced && st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean checkBalance(char incomingBracket, char popedBreacket){
        boolean status = false;
        if(incomingBracket == '}' && popedBreacket == '{'){
            status = true;
        }else if (incomingBracket == ']' && popedBreacket == '['){
            status = true;
        }else if (incomingBracket == ')' && popedBreacket == '('){
            status = true;
        }
        return status;
    }
}
