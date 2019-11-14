package stack;

import java.util.Stack;

public class SortStackUsingAnotherStack {

    public static void main(String[] args) {

        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();

        st1.push(1);
        st1.push(5);
        st1.push(2);
        st1.push(9);
        st1.push(6);

        System.out.println(st2.peek());

    }
}
