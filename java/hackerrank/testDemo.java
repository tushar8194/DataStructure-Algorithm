package hackerrank;

public class testDemo {

    Node sortedMerge(Node headA, Node headB)
    {

    /* a dummy first node to  hang the result on */
        Node dummyNode = new Node("");

    /* tail points to the last result node */
        Node tail = dummyNode;

        while(true)
        {

        /* if either list runs out,  use the other list */
            if(headA == null)
            {
                tail.next = headB;
                break;
            }
            if(headB == null)
            {
                tail.next = headA;
                break;
            }

        /* Compare the data of the two lists whichever lists' data is smaller, append it into tail and advance the head to the next Node  */
            //if(headA.data <= headB.data)
            if(Integer.parseInt(headA.data) <= Integer.parseInt(headB.data))
            {
                tail.next = headA;
                headA = headA.next;
            }
            else
            {
                tail.next = headB;
                headB = headB.next;
            }

        /* Advance the tail */
            tail = tail.next;

        }
        return dummyNode.next;
    }
}
