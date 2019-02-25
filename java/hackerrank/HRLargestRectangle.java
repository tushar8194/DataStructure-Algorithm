package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HRLargestRectangle {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            int hItem = scanner.nextInt();
            h[i] = hItem;
        }

        long result = largestRectangle(h);

        System.out.println(result);

        scanner.close();
    }

    static long largestRectangle(int[] h) {

        int i=0;
        long maxArea = 0;
        long area = 0;

        Stack<Integer> st = new Stack<>();

        while(i<h.length){

            if(st.isEmpty() || st.peek() < h[i]){
                st.push(i);
            }else {


                area = h[st.pop()]*(i-st.pop()-1);

                if(area > maxArea){
                    maxArea = area;
                }
            }
            i++;

        }

        return maxArea;

    }

}
