package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []arr = {2,4,6,1,8};
        insertionSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void insertionSort(int[] arr){
        int i,j,temp;
        for (i=1;i<=arr.length-1;i++){
            j=i;
            int v= arr[i];
            while( j>=1 && arr[j-1]>v){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j] = v;
        }
    }


}
