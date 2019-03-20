package hackerrank;

public class HRLinkedListMergeTwoSortedLists {

    public static void main(String[] args) {

        LinkedList L1 = new LinkedList();
        L1.insertAtLast("A");
        L1.insertAtLast("B");
        L1.insertAtLast("C");
        L1.insertAtLast("D");
        L1.insertAtLast("E");

        LinkedList L2 = new LinkedList();
        L2.insertAtLast("B");
        L2.insertAtLast("C");
        L2.insertAtLast("D");


        System.out.print("List L1 : "); L1.printList();
        System.out.print("\nList L2 : "); L2.printList();

        Node mergedListHead = mergeLists(L1.head,L2.head);

        System.out.println("\n----------------------");

        while (mergedListHead != null){
            System.out.print(mergedListHead.data + " ");
            mergedListHead = mergedListHead.next;
        }

    }


    public static Node mergeLists(Node head1, Node head2){

        Node curr1 = head1;
        Node curr2 = head2;
        Node dummy = new Node("");
        Node tail = dummy;

        while (true){

         if(curr1 != null){
             tail.next = curr1;
             break;
         }
         if(curr2 != null){
             tail.next = curr2;
             break;
         }

         int response = compare((curr1.data.charAt(0)),(curr2.data.charAt(0)));

        // System.out.println("response : " + response);

         if(response < 0){
             tail.next = curr1;
             curr1 = curr1.next;
         }else if(response == 0){
             tail.next = curr1;
             tail = tail.next;
             tail.next = curr2;

             curr1 = curr1.next;
             curr2 = curr2.next;

         }else {
             tail.next = curr2;
             curr2 = curr2.next;
            }

         tail = tail.next;
        }

        return dummy.next;
    }



    public static int compare(Character c1, Character c2)
    {
        // ignoring case
        return (Character.toLowerCase(c1) - Character.toLowerCase(c2));
    }

}
