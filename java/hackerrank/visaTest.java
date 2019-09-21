package hackerrank;

import linkedlist.singly.LinkedList;
import linkedlist.singly.Node;

public class visaTest {

    public static void main(String[] args) {
        linkedlist.singly.LinkedList list = new LinkedList();
        list.addElementAtBegining("3");
        list.addElementAtBegining("2");
        list.addElementAtBegining("1");
        list.addElementAtBegining("300");
        list.addElementAtBegining("19");
        list.addElementAtBegining("3");
        list.addElementAtBegining("81");
        list.addElementAtBegining("59");
        System.out.println("Head -> " + list.head.data);

        Node newHead = removeNodes(list.head,3);
        while(newHead != null){
            System.out.println(newHead.data);
            newHead = newHead.next;
        }
    }


    public static Node removeNodes(Node listHead, int x) {

        Node head= listHead;
        Node current= listHead;
        Node previous = listHead;
        int i=0;

        while(current != null){
            if(Integer.parseInt(current.data) > x){
                previous.next=current.next;
                current = current.next;
                if(i==0){
                    head = current;
                }
            } else{
                previous = current;
                current = current.next;
                i++;
            }

        }

        return head;

    }

}
