package stack;

import java.util.Stack;

public class StackGetMin {

    /* Problem : Create own StackUsingArray which should returns minimum value element even after pop() operation (No duplicates) */

    Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> stMin = new Stack<Integer>();

    // If inserting element is smaller then the min stack peek then insert in both Stacks.
    public void push(int data){
        if(stMin.isEmpty()){
            stMin.push(data);
            st.push(data);
        }else {
            if(data < stMin.peek()){
                stMin.push(data);
                st.push(data);
            }else {
                st.push(data);
            }
        }
    }

    // If pop() returns the element which is current minimum then remove from MinStack as well.
    public int pop(){
        int poped = st.pop();
        if(stMin.peek() == poped){
            stMin.pop();
        }
        return poped;
    }


    // Always return top element of MinStack.
    public int getMin(){
        return stMin.peek();
    }


    public static void main(String[] args) {

        // Inserting [1,,2,4,-1,0,5]
        StackGetMin obj = new StackGetMin();
        obj.push(1);
        obj.push(2);
        obj.push(4);
        obj.push(-1);
        obj.push(0);
        obj.push(5);

        System.out.println("When Peek is : " + obj.st.peek());
        System.out.println("Now Minimum is : " + obj.getMin());

        // removing last element
        obj.pop();
        System.out.println("When Peek is : " + obj.st.peek());
        System.out.println("Now Minimum is : " + obj.getMin());

        // removing last element
        obj.pop();
        System.out.println("When Peek is : " + obj.st.peek());
        System.out.println("Now Minimum is : " + obj.getMin());

        // removing last element
        obj.pop();
        System.out.println("When Peek is : " + obj.st.peek());
        System.out.println("Now Minimum is : " +obj.getMin());

    }


}
