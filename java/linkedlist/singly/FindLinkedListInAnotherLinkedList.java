package linkedlist.singly;

public class FindLinkedListInAnotherLinkedList {

    public static void main(String[] args) {
        LinkedList mainList = new LinkedList();
        mainList.addElementAtBegining("E");
        mainList.addElementAtBegining("D");
        mainList.addElementAtBegining("C");
        mainList.addElementAtBegining("B");
        mainList.addElementAtBegining("A");

        LinkedList subList = new LinkedList();
        subList.addElementAtBegining("C");
        subList.addElementAtBegining("B");
        subList.addElementAtBegining("A");

        System.out.println(isSubLinkedList(mainList.head,subList.head));

    }

    public static boolean isSubLinkedList(Node headMain, Node headSub){
        Node MainCurrent = headMain;
        Node SubCurrent = headSub;

        System.out.println("1 Main : " + MainCurrent.data + "    Sub : " + SubCurrent.data);

        while (MainCurrent.data != SubCurrent.data && MainCurrent != null && SubCurrent != null){
            MainCurrent = MainCurrent.next;
        }

        System.out.println("Main : " + MainCurrent.data + "    Sub : " + SubCurrent.data);

        while (SubCurrent != null && MainCurrent != null){
            if(SubCurrent.data != MainCurrent.data){
                return false;
            }
            if(SubCurrent.next != null && MainCurrent.next != null){
                SubCurrent = SubCurrent.next;
                MainCurrent = MainCurrent.next;
            }
        }

        return true;
    }


}
