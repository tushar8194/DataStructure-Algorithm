package interview.goldmansachs;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

public class encoderdecoder {

    /*Problem :
    1= encode
    2 = decode
    1 open 123
    oppeeen    */

    public static void main(String[] args) {

        System.out.println(secureChanel(1,"open","12"));
        System.out.println(secureChanel(2,"oppen","12"));

        System.out.println("------------");

        System.out.println(secureChanel(1,"open","1234"));
        System.out.println(secureChanel(2,"oppeeennnn","1234"));

        System.out.println("------------");

        System.out.println(secureChanel(1,"","1234"));
       // System.out.println(secureChanel(2,"oppeeennnn","1234"));

        System.out.println("------------");

        System.out.println(secureChanel(1,"open","1101"));
       //System.out.println(secureChanel(2,"open","1101"));


    }


    public static String secureChanel(int operation, String message, String key) {


        try {
            if(key == "" || message == "" )
            {
                throw new Exception("");
            }

            if (operation == 1) {
                return encode(message, key);
            } else if (operation == 2) {
                return decode(message, key);
            } else {
                throw new Exception("");
            }
        }catch (Exception e){
            return "-1";
        }
    }

    private static String encode(String message, String keys){

        char[] ch = message.toCharArray();
        char[] key = keys.toCharArray();
        int keyslength = key.length;
        StringBuilder rtrn = new StringBuilder();

        for(int i=0; i<ch.length; i++){

            char c = ch[i];

            if(i+1 <= keyslength){

                if(key[i] == 0){
                    rtrn.append(c);
                }

                char[] repeat = new char[key[i]-48];
                Arrays.fill(repeat, c);
                rtrn.append(repeat);
            }
            else {
                rtrn.append(c);
            }

        }


        return rtrn.toString();
    }


    private static String decode(String message, String key){
        char[] ch = message.toCharArray();
        int keyslength = key.length();
        StringBuilder rtrn = new StringBuilder();

        for(int i=0,j=0 ; i< ch.length ; i++,j++){
            char c = ch[i];
            if(j < keyslength){
                rtrn.append(c);
                i= i+ key.charAt(j)-48-1;
            }else {
                rtrn.append(c);
            }
        }

        return rtrn.toString();
    }

}
