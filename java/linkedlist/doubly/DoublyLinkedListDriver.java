package linkedlist.doubly;

public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DoublyLinkedList list= new DoublyLinkedList();
        list.insertAtBegining(50);
        list.insertAtBegining(40);
        list.insertAtBegining(30);
        list.insertAtBegining(20);
        list.insertAtBegining(10);

        list.deleteFromStart();

        list.deleteFromLast();

        list.printForward();
        System.out.println("----");
        list.printBackword();

        list.insertAtLast(70);
        System.out.println("----");
        list.printForward();

        list.deleteAfter(40);
        System.out.println("----");
        list.printForward();


    }
}
