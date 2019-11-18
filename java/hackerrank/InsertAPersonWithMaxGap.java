package hackerrank;

public class InsertAPersonWithMaxGap {

    public static void main(String[] args) {

        String input = "10000000000100";
        //0000000000100
        //010101010100

        System.out.println(input);
        System.out.println(insertPerson(input));


    }

    public static String insertPerson(String inp) {

        int st_index = -1;
        int ed_index = -1;
        int max_st_index = 0;
        int gap = 0;

        int inputLength = inp.length();

        for (int i=0; i<inputLength ; i++){

            ed_index = i;
            if(inp.charAt(i) == '1'){
                st_index = i;
            }

            System.out.println("ed_index " + ed_index );
            System.out.println("st_index " + st_index );


            if(gap < (ed_index - st_index)){
                gap = ed_index - st_index ;
                System.out.println("gap " + gap);
                max_st_index = st_index;
            }

        }
        System.out.println("Max Start " + max_st_index);
        System.out.println("End " + ed_index);
        System.out.println("Length " + inp.length());
        System.out.println("gap " + gap);

        int pos = 0;

        if(max_st_index == 0){
            pos = 0;
        } else if( max_st_index + gap == inp.length()){
            pos = inp.length()+1;
        }else {
            pos = max_st_index + (gap/2) + 1;
        }
        System.out.println("pos " + pos);

        String output = inp.substring(0,pos) + 'k' + inp.substring(pos+1);

        return output;

    }
}
