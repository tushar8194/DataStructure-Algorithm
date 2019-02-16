package randomquestions;

public class tripletNumber {
    public static void main(String[] args) {

        int[] input= {1,2,1,2,4,2,4};
        int output = input[0];

        for(int i=1; i<input.length ;i++)
        {
            output = input[i]^output;
        }

        System.out.println("output : " + output);
    }
}
