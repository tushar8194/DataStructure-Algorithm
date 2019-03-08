package linkedlist.singly;

public class RemoveDuplicateNodes {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addElementAtBegining("F");
        list.addElementAtBegining("F");
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
                    if(current.next.next != null){
                        current.next = current.next.next;
                    } else {
                        current.next = null;
                        break;
                    }
                }
        current = current.next;
        }
    }



}
