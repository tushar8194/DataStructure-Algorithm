package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int []arr = {8,4,3,9,1};
        //BubbleSortImproved(arr);
        BubbleSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void BubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

    }
}
