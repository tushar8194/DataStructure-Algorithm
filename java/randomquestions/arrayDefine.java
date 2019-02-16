package randomquestions;

public class arrayDefine {

    public static void main(String[] args) {
        isEmpty();
    }

    public static void isEmpty()
    {
        String[] a = new String[5];
        System.out.println(a[4]);    // will print default value.



        int[] myIntArray1 = new int[3];
        int[] myIntArray2 = {1,2,3};
        int[] myIntArray3 = new int[]{1,2,3};


        String[] myStringArray1 = new String[3];
        String[] myStringArray2 = {"a","b","c"};
        String[] myStringArray3 = new String[]{"a","b","c"};


    }
}
