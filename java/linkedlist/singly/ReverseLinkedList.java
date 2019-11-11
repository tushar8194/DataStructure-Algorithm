package linkedlist.singly;


public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList llist = new LinkedList();

        llist.addElementAtBegining("4");
        llist.addElementAtBegining("3");
        llist.addElementAtBegining("2");
        llist.addElementAtBegining("1");

        printList(llist.head);

        Node newHead = reverseList(llist.head);

        printList(newHead);
    }

    public static void printList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node reverseList(Node head){
        Node curr = head;
        Node following = head;
        Node prev = null;

        while (curr !=null ){
            following = curr.next;
            curr.next = prev;
            prev = curr;
            curr = following;
        }

        return prev;
    }
}
