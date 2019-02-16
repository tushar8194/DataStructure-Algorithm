package stack;

import java.util.Stack;

public class BalancedString {

   /* Question : Identify if given string is balanced string or not.
    * Balanced meaning : Their should be a opening bracket before a closing one.
    * Example : {}() -> Balanced and }{)( -> Not balanced
    * */

    public static void main(String[] args) {

        boolean isBalanced = false;

        Stack<Character> st = new Stack<>();

        String str = "{[(])}";

        if(str.length()%2 != 0  || str.isEmpty())
        {
            System.out.println("String is not balanced");
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
                }
            }
            if (isBalanced && st.isEmpty()) {
                System.out.println("String is Balanced");
            } else {
                System.out.println("String is not Balanced.");
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
