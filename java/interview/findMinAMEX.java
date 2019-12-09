package interview;

import java.util.Random;

public class findMinAMEX {

    public static void main(String[] args) {

        int[] arr = solution(10);

        for(int i=0; i< 10; i ++){
            System.out.println(arr[i]);
        }

    }


    public static int[] solution(int N){

        Random rand = new Random();
        int[] rtrnArray = new int[N];

        for(int i=0; i< N ; i ++){
            rtrnArray[i] = rand.nextInt( 1000 ) + 1;
        }

        return rtrnArray;

    }
}
