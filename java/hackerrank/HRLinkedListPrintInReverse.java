package hackerrank;

import linkedlist.Node;

public class HRLinkedListPrintInReverse {

    public static void main(String[] args) {

    }

    static void reversePrint(Node head) {
        Node current = head;

        if(current ==  null)
            return;

        reversePrint(head.next);

        System.out.println(head.data);
    }


}
