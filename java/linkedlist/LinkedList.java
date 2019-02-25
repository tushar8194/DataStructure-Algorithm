package linkedlist;

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

    public void insertAtLast(String data){
         Node current = head;
         while (current.next!=null){
             current = current.next;
         }
         current.next.data = data;

    }


    public void deleteFromLast(){

    }

    public void deleteNode(String data){
        if(null == head){
            head = new Node(data);
        }else {

        }

        Node current = null;
        Node prv = null;
        while (current.data!=data){
            prv = current;
            current = current.next;
        }
        prv.next = current.next;
    }



}
