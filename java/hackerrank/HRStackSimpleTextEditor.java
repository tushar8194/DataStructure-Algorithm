package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class HRStackSimpleTextEditor {

    /* Problem : https://www.hackerrank.com/challenges/simple-text-editor/problem */

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();
        Scanner sc =new Scanner(System.in);

        int numcases = sc.nextInt();
        String currentString = "";

        while (numcases > 0){
            int instruct = sc.nextInt();

            switch (instruct){
                case 1 :
                    st.push(currentString);
                    String append = sc.next();
                    currentString = currentString + append;
                    break;
                case 2 :
                    st.push(currentString);
                    int numChar = sc.nextInt();
                    currentString = currentString.substring(0,currentString.length()-numChar);
                    break;
                case 3 :
                    int index = sc.nextInt();
                    System.out.println(currentString.charAt(index - 1));
                    break;
                case 4 :
                    currentString = st.pop();
                    break;
                default:
                    break;
            }
        numcases--;
        }
    }

}
