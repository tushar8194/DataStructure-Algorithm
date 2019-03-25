package linkedlist.singly;

public class DeleteKthNodeFromLast {

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

        deleteKthNode(list.head,3);
        System.out.println("--------");
        list.printList();

    }


    public static void deleteKthNode(Node head, int k){
        Node current = head;
        int i= 0;

        while (current != null){
            current = current.next;
            i++;
        }

        k = i-k;
        i = 1;
        current = head;

        while (i != k ){
            current = current.next;
            i++;
        }
        current.next = current.next.next;
    }
}
