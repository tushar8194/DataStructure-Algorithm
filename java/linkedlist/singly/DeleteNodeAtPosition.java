package linkedlist.singly;

public class DeleteNodeAtPosition {

    public static Node deleteNodeAtPosition(Node head, int position){
        Node current = head;
        Node prev = null;
        int i=0;


        if(i == position && head.next != null){
            head = head.next;
        } else if(i == position && head.next == null){
            head = null;
        } else{
            while (current != null && i < position ){
                prev = current;
                current = current.next;
                i++;
            }
            prev.next = current.next;
        }
        return head;

    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addElementAtBegining("B");
        list.addElementAtBegining("A");
        list.printList();
        System.out.println("------------------------------");

        list.head = deleteNodeAtPosition(list.head,0);
        list.printList();

    }
}
