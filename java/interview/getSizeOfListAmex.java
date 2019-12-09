package interview;

public class getSizeOfListAmex {

    public static void main(String[] args) {

        //int[] arr = {1,4,-1,3,2};   // length=4
        int[] arr = {9,4,3,-1,-2,4,7,9,7,2};

        System.out.println(solution(arr));

    }

    public static int solution(int[] A){

        int listSize = 0;
        int current = 0;

        while ( current != -1){
            current = A[current];
            listSize++;
        }

        return listSize;
    }
}
