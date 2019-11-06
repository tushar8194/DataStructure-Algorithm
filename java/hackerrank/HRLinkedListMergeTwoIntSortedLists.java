package hackerrank;

public class HRLinkedListMergeTwoIntSortedLists {

    public static void main(String[] args) {

        LinkedList L1 = new LinkedList();
        L1.insertAtLast("2");
        L1.insertAtLast("5");


        LinkedList L2 = new LinkedList();
        L2.insertAtLast("4");
        L2.insertAtLast("9");



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

             if(curr1 == null){
                 tail.next = curr2;
                 break;
             }
             if(curr2 == null){
                 tail.next = curr1;
                 break;
             }

             int response = compare((curr1.data),(curr2.data));

            // System.out.println("response : " + response);

             if(response < 0){
                 tail.next = curr1;
                 curr1 = curr1.next;
             }else if(response == 0){
                 tail.next = curr2;
                 curr2 = curr2.next;

                 tail = tail.next;

                 tail.next = curr1;
                 curr1 = curr1.next;

             }else {
                 tail.next = curr2;
                 curr2 = curr2.next;
                }

             tail = tail.next;
            }

            return dummy.next;
        }



    public static int compare(String c1, String c2)
    {
        // ignoring case
        return (Integer.parseInt(c1) - Integer.parseInt(c2));
    }

}
