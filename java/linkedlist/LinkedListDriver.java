package linkedlist;

public class LinkedListDriver {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addElementAtBegining("A");
        list.addElementAtBegining("B");
        list.addElementAtBegining("C");
        list.addElementAtBegining("D");
        list.addElementAtBegining("E");
        list.addElementAtBegining("F");
        list.printList();

        list.insertAtLast("H");

        System.out.println("-------------");

        list.printList();
    }

}
