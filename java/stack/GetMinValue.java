package stack;

import java.util.Stack;

public class GetMinValue {

    static int[] arr = {1,2,4,-1,0,5};

    static Stack<Integer> st = new Stack<Integer>();
    static Stack<Integer> minSt = new Stack<Integer>();


    public static void main(String[] args) {

        for(int i=0;i<arr.length;i++){
            getMinVal(arr[i]);
        }

        System.out.println("Min Value: " + minSt.pop());

    }

    public static void getMinVal(int a){
        if(minSt.isEmpty() || minSt.peek() > a ){
            minSt.push(a);
        }
        st.push(a);
    }
}
