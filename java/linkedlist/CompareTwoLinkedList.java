package linkedlist;

public class CompareTwoLinkedList {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addElementAtBegining("H");
        list1.addElementAtBegining("G");
        list1.addElementAtBegining("F");
        list1.addElementAtBegining("E");
        list1.addElementAtBegining("D");
        list1.addElementAtBegining("C");
        list1.addElementAtBegining("B");
        list1.addElementAtBegining("A");


        LinkedList list2 = new LinkedList();
        list2.addElementAtBegining("H");
        list2.addElementAtBegining("G");
        list2.addElementAtBegining("F");
        list2.addElementAtBegining("E");
        list2.addElementAtBegining("D");
        list2.addElementAtBegining("C");
        list2.addElementAtBegining("B");
        list2.addElementAtBegining("A");

        System.out.println(compareLists(list1.head, list2.head));

    }

    static boolean compareLists(Node head1, Node head2) {

        Node current1 = head1;
        Node current2 = head2;

        while (current1 != null){

            if(current1 != current2){
                return false;
            } else {
                current1 = current1.next;
                current2 = current2.next;
            }
        }

        if(current1 != null && current2 == null || current1 == null && current2 != null){
            return false;
        }

        return true;
    }
}
