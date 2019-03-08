package linkedlist.singly;

public class InsertNodeAtPostition {

    /*Problem : https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem*/



    public static void intsertNodeAtPosition(Node head, String data, int position){
        Node current = head;
        Node prev = head;
        int i=0;

        Node node = new Node(data);

        if(head == null){
            head = node;
        }else {
            while (i<=position){
                prev = current;
                current = current.next;
                i++;
            }
            prev.next = node;
            node.next = current;
        }

    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addElementAtBegining("H");
        list.addElementAtBegining("G");
        list.addElementAtBegining("F");
        list.addElementAtBegining("E");
        list.addElementAtBegining("D");
        list.addElementAtBegining("C");
        list.addElementAtBegining("B");
        list.addElementAtBegining("A");
        list.printList();
        System.out.println("------------------------------");

        intsertNodeAtPosition(list.head,"TUSHAR",7);
        list.printList();

    }
}
