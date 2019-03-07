package linkedlist;

public class DetectIntersactionTwoLinkedList {

    public static void main(String[] args) {

        // Problem : Find intersaction point of two LinkedList.

        LinkedList L1 = new LinkedList();
        Node A = L1.insertAtLast("A");
        Node B = L1.insertAtLast("B");
        Node C = L1.insertAtLast("C");
        Node D = L1.insertAtLast("D");
        Node E = L1.insertAtLast("E");

        LinkedList L2 = new LinkedList();
        Node G = L2.insertAtLast("G");

        G.next = C;

       // L1.printList();
       // L2.printList();

        System.out.println(interscationPoint(L1.head,L2.head).data);

    }

    public static Node interscationPoint(Node headL1, Node headL2){
        Node L1Current = headL1;
        int diff =0;
        int L1length =0 ;
        while (L1Current != null){
            L1Current = L1Current.next;
            L1length++;
        }


        Node L2Current = headL2;
        int L2length = 0;
        while (L2Current !=null){
            L2Current = L2Current.next;
            L2length++;
        }

        if(L1length > L2length){
            diff = L1length - L2length;
            return getNode(headL1,headL2,diff);
        }else {
            diff = L2length - L1length;
            return getNode(headL2,headL1,diff);
        }
    }

    public static Node getNode(Node headL1, Node headL2, int diff){
        int i = 0;
        while (i < diff){
            headL1 = headL1.next;
            i++;
        }

        while (headL1 != headL2){
            headL1 = headL1.next;
            headL2 = headL2.next;
        }

        return headL1;
    }
}

