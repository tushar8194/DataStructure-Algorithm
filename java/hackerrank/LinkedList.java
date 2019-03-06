package hackerrank;

public class LinkedList {

    Node head;
    Node tail;

    public LinkedList(){
        this.head= null;
        this.tail=null;
    }

    public void addElementAtBegining(String data){
        if(null == head) {
            head = new Node(data);
        } else {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
    }

    public void printList(){
        Node current = head;
        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public Node insertAtLast(String data) {
        Node addNode = new Node(data);
        Node current = head;
        Node prev = null;

        if (current == null) {
            head = addNode;
        } else {
        while (current != null) {
            prev = current;
            current = current.next;
        }
        prev.next = addNode;
    }
        return addNode;
    }


    public void deleteFromLast(){
        if(head != null){
            Node current = head;
            Node prev = head;
            while (current.next != null){
                prev = current;
                current = current.next;
            }
            prev.next = null;
        }
    }


    public void deleteNode(String data) {
        if (null != head) {
        Node current = head;
        Node prv = head;
        while (current.data != data) {
            prv = current;
            current = current.next;
        }
        prv.next = current.next;
      }
    }
}
