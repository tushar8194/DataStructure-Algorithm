package linkedlist;

public class DeleteNodeAtPosition {

    public static void deleteNodeAtPosition(Node head, int position){
        Node current = head;
        Node prev = head;
        int i=0;


        if(head != null){
            while (i<position){
                prev = current;
                current = current.next;
                i++;
            }
            prev.next = current.next;
        }

    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addElementAtBegining("H");
        list.addElementAtBegining("G");
        list.addElementAtBegining("F");
        list.addElementAtBegining("E");
        list.addElementAtBegining("D");
        list.addElementAtBegining("C");
        list.addElementAtBegining("B");
        list.addElementAtBegining("A");
        list.printList();
        System.out.println("------------------------------");

        deleteNodeAtPosition(list.head,3);
        list.printList();

    }
}
