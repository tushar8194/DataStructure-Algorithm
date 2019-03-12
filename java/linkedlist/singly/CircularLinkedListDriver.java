package linkedlist.singly;

public class CircularLinkedListDriver {

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        //list.insertAtBegining("A");
        list.insertAtEnd("B");
        list.insertAtEnd("C");
        list.insertAtEnd("D");
        list.insertAtEnd("E");
        list.insertAtEnd("F");

        System.out.println("-----");
        list.printCircularList();

        list.removeFirst();

        System.out.println("-----");
        list.printCircularList();

        list.removeLast();

        System.out.println("-----");
        list.printCircularList();

    }
}
