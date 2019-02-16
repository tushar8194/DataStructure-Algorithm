package stack;

import java.util.Arrays;

public class StackUsingArray2 {


    /*
     * int[] myIntArray = new int[3];
     * int[] myIntArray = {1,2,3};
     * int[] myIntArray = new int[]{1,2,3};
     * */

    // initilazing Array with size 5 and top as NULL (-1)

    static  int[] input = new int[5];
    static int top = -1;

    public static void main(String[] args) {

        System.out.println("---------------------------------------------");
        System.out.println("isEmpty : " + isEmpty() + " and Top is : " + top);
        System.out.println("Initial Size of Array :" + input.length);
        pop();
        System.out.println(Arrays.toString(input));

        System.out.println("---------------------------------------------");
        System.out.println("Add Element :1");
        push(1);
        System.out.println("Now Peek is :" + peek() + " and Top is : " + top);
        System.out.println(Arrays.toString(input));


        System.out.println("---------------------------------------------");
        System.out.println("Add two more element 2 and 3");
        push(2);
        push(3);
        System.out.println("Now Peek is :" + peek() + " and Top is : " + top);
        System.out.println(Arrays.toString(input));
        System.out.println("Add two more element 4 and 5");
        push(4);
        push(5);
        System.out.println(Arrays.toString(input));
        System.out.println("Now Peek is :" + peek() + " and Top is : " + top);
        System.out.println("isEmpty : " + isEmpty() + " and isFull : "+ isFull());


        System.out.println("---------------------------------------------");
        System.out.println("Adding Extra Element 6");
        push(6);
        System.out.println(Arrays.toString(input));


        System.out.println("---------------------------------------------");
        System.out.println("Delete top element.");
        pop();
        System.out.println(Arrays.toString(input));
        System.out.println("Now Peek is :" + peek() + " and Top is : " + top);
        System.out.println("isEmpty : " + isEmpty() + " and isFull : "+ isFull());

    }


    public static void push(int num)
    {
        // use isFull() method
        if((top+1) < input.length){
            top = top + 1;
            input[top] = num;
        }
        else {
            System.out.println("StackUsingArray is FULL! Can't add.");
        }

    }

    public static void pop()
    {
        // use isEmpty() method
        if(top == -1)
        {
            System.out.println("Trying to pull fro  m empty stack : StackUsingArray is EMPTY!");
        }else {
             input[top] = 0;
             top = top - 1;
        }
    }

    public static int peek()
    {
        if(top == -1)
        {
            System.out.println("No Peek and StackUsingArray is EMPTY!");
            return 0;
        }else {
            return input[top];
        }

    }

    public static boolean isEmpty()
    {
        if(top == -1) {
            return  true;
        }
        else {
            System.out.println("Not Empty and length : "+ input.length);
            return false;
        }
    }

    public static boolean isFull()
    {
        if(input.length == (top+1)) {
            return true;
        }
        else {
            return false;
        }
    }



}
