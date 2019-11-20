package tree;


import java.io.File;
import java.util.Scanner;

public class findLevelBasedOnManager {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(new File("./java/tree/resources/data.csv"));
        ManagementreeNode root =null;
        String header = sc.nextLine();
        String line = sc.nextLine();
        String data[]=line.split(",");

        if(data[2] == "Null"){
            root  = new ManagementreeNode(data[0]);
            root.setName(data[1]);
        }

        while (sc.hasNext()){
             line = sc.nextLine();
             data =line.split(",");
             ManagementreeNode child = new ManagementreeNode(data[0]);
            child.setName(data[1]);
            child.setManager(new ManagementreeNode(data[2]));
        }

    }
}


class ManagementreeNode {

    String id;
    String name;
    ManagementreeNode Manager;

    ManagementreeNode(String id){
        this.name = name;
        this.id = null;
        this.Manager = null;
    }

    ManagementreeNode(String id,String name,ManagementreeNode Manager){
        this.name = name;
        this.id = id;
        this.Manager = Manager;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ManagementreeNode getManager() {
        return Manager;
    }

    public void setManager(ManagementreeNode manager) {
        Manager = manager;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}