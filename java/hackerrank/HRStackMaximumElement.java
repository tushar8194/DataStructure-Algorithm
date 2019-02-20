package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class HRStackMaximumElement {

    /* Problem : https://www.hackerrank.com/challenges/maximum-element/problem */


    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> stmax = new Stack<>();


        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();

        while(numCases > 0){

            int instrc = sc.nextInt();
            switch (instrc){

                case 1 :
                    int data = sc.nextInt();
                    if(stmax.isEmpty()){
                        stmax.push(data);
                    }else{
                        if(stmax.peek() < data){
                            stmax.push(data);
                        }else {
                            st.push(data);
                        }
                    }
                    break;
                case 2 :
                    int poped = 0;
                    if(!st.isEmpty()){
                        poped  = st.pop();
                    }
                    if(stmax.peek() == poped){
                        stmax.pop();
                    }
                    break;
                case 3 :
                    System.out.println(stmax.peek());
                    break;
                default:
                    break;

            }
            numCases --;
        }
    }
}
