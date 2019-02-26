package hackerrank;

import java.util.*;


public class HRStackLargestRectangle {

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

        if(h == null || h.length == 0){
            return 0;
        }

        int i = 0;
        long maxArea = 0;
        long area = 0;

        Stack<Integer> st = new Stack<>();

        while (i < h.length) {

            if (st.isEmpty() || h[st.peek()] < h[i]) {
                st.push(i);
                i++;
            } else {
                int top = st.pop();
                if (st.isEmpty()) {
                    area = h[top] * i;
                } else {
                    area = h[top] * (i - st.peek() - 1);
                }
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }


        while (!st.isEmpty()) {
            int top = st.pop();
            if (st.isEmpty()) {
                area = h[top] * i;
            } else {
                area = h[top] * (i - st.peek() - 1);
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
            return maxArea;
    }
}
