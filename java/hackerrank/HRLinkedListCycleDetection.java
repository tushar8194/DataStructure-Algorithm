package hackerrank;

public class HRLinkedListCycleDetection {
    public static void main(String[] args) {

    /* Problem : First find if LinkedList is having a loop or not
    *           IF FOUND THEN : Remove that loop
    *  Solution : find mid point of loop.
    *           if there a row and one guy is moving one step and second guy is moving two steps then
    *           first guy will reach at mid and second guy will reach at end.
    *  https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem */


        LinkedList list = new LinkedList();
        Node A = list.insertAtLast("A");
        Node B = list.insertAtLast("B");
        Node C = list.insertAtLast("C");
        Node D = list.insertAtLast("D");
        Node E = list.insertAtLast("E");

        E.next = C;

        //list.printList();  -- printing a loop

        if(hasCycle(list.head)){
            System.out.println(hasCycle(list.head));
            System.out.println("Cycle Detected, Now Removing");
            removeCycle(list.head);
            System.out.println(hasCycle(list.head));
        }else {
            System.out.println("No Cycle.");

        }

        //list.printList();  -- Now printing without loop    :)

    }



    public static boolean hasCycle(Node head) {
        Node ptr1 = head;
        Node ptr2 = head;

        while (ptr1 != null && ptr2.next != null && ptr1.next != null && ptr2.next.next != null){

            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

            if(ptr1 == ptr2){
                return true;
            }
        }

        return false;
    }


    public static void removeCycle(Node head) {
        Node ptr1 = head;
        Node ptr2 = head;

        while (ptr1 != null && ptr2.next != null && ptr1.next != null && ptr2.next.next != null) {

            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

            if (ptr1.data == ptr2.data) {
                ptr1 = head;
                break;
            }
        }

        System.out.println("ptr1 -> " + ptr1.data);
        System.out.println("ptr2 -> " + ptr2.data);

        while (ptr1.next.data != ptr2.next.data) {
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }
        ptr2.next = null;
    }


}
