package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []arr = {2,4,6,1,8};
        selectionSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int[] arr){
        int len,temp,i,j,min;
        len =arr.length;
        for ( i=0;i<len;i++){
            min = i;
            for ( j=i+1;j<len;j++){
                if (arr[min]>arr[j]){
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
