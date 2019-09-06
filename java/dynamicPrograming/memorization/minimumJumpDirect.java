package dynamicPrograming.memorization;

public class minimumJumpDirect {

    public static void main(String[] args) {

        int arr[] = {1, 3, 6, 1, 0, 9};

        //System.out.println("Minimum number of jumps to reach end is : ");
         minJumps(arr,arr.length);
    }

    public static void minJumps(int[] arr, int length){

        int len = length-1;
        String sol = "0->";
        int maxValue = 0;

        for(int i=0; i<len; i++){

            int cuuentIndex = i;
            int value = arr[i];


            for(int j=cuuentIndex ; j <= (cuuentIndex+value) ; j++) {
                if(arr[j] > maxValue){
                    maxValue = arr[j];
                    cuuentIndex = j;
                }
            }
            i = cuuentIndex;
            sol = sol + cuuentIndex + "->";
        }


        System.out.println(sol);
    }

}
