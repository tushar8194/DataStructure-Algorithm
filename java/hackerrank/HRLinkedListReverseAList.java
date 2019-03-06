package hackerrank;

public class HRLinkedListReverseAList {

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

        list1.printList();

        System.out.println("--------------------------");

        reverse(list1.head);

        list1.printList();

    }


    public static void reverse(Node head){
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current ;
            current = next;
        }

    }


}
