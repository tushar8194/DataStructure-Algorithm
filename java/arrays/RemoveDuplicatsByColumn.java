package arrays;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatsByColumn {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(new File("./java/arrays/data.csv"));

        String column[] = new String[2];
        ArrayList<String> rows = new ArrayList<String>();
        String header = sc.nextLine();
        while (sc.hasNext()){
            String line = sc.nextLine();
            column[0] = line.split(",")[0];
            column[1] = line.split(",")[1];
            Arrays.sort(column);
            String newLine = column[0] + "," + column[1];
            if(!rows.contains(newLine)){
                rows.add(newLine);
            }
        }

        System.out.println(header);

        for(int i=0; i<rows.size();i++){
            System.out.println(rows.get(i));
        }

    }
}
