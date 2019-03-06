package hackerrank;

public class HRLinkedListCycleDetection {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Node A = list.insertAtLast("A");
        Node B = list.insertAtLast("B");
        Node C = list.insertAtLast("C");
        Node D = list.insertAtLast("D");

        D.next = B;

        //list.printList();  -- printing a loop

        System.out.println(hasCycle(list.head));


    }



    public static boolean hasCycle(Node head) {
        Node ptr1 = head;
        Node ptr2 = head.next;

        while (ptr1 != null && ptr2.next != null && ptr1.next != null && ptr2.next.next != null){

            if(ptr1 == ptr2){
                return true;
            }

            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

        }

        return false;
    }

}
