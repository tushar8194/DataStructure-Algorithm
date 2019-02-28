package linkedlist;

public class LinkedListDriver {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addElementAtBegining("F");
        list.addElementAtBegining("E");
        list.addElementAtBegining("D");
        list.addElementAtBegining("C");
        list.addElementAtBegining("B");
        list.addElementAtBegining("A");
        list.printList();

        System.out.println("Now insert G at last.");
        list.insertAtLast("G");
        list.printList();

        System.out.println("Delete F,G from last.");
        list.deleteFromLast();
        list.deleteFromLast();
        list.printList();

        System.out.println("Delete B");
        list.deleteNode("B");
        list.printList();

    }

}
