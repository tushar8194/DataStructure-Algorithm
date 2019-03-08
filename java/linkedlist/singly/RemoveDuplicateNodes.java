package linkedlist.singly;

public class RemoveDuplicateNodes {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addElementAtBegining("F");
        list.addElementAtBegining("E");
        list.addElementAtBegining("D");
        list.addElementAtBegining("D");
        list.addElementAtBegining("D");
        list.addElementAtBegining("B");
        list.addElementAtBegining("B");
        list.addElementAtBegining("A");
        list.printList();
        removeDuplicate(list.head);
        System.out.println("-------");
        list.printList();
    }

    public static void removeDuplicate(Node head){
        Node current = head;
        while (current != null && current.next != null){
                while (current.data == current.next.data){
                    current.next = current.next.next;
                }
                current = current.next;
        }
    }



}
