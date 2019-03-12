package linkedlist.singly;

public class CircularLinkedList {

    Node tail ;
    public CircularLinkedList(){
        this.tail = null;
    }

    public void insertAtBegining(String data){
        Node node = new Node(data);

        if(tail == null){
            tail = node;
            tail.next = node;
        }else {
             node.next = tail.next ;
             tail.next = node;
        }
    }

    public void insertAtEnd(String data){
        Node node = new Node(data);

        if(tail == null){
            tail = node;
            tail.next = node;
        } else {
            node.next = tail.next;
            tail.next = node;
            tail = tail.next;
        }
    }

    public void removeFirst(){
        if(tail != null){
            tail.next = tail.next.next;
        }
    }

    public void removeLast(){
        if(tail != null){
            tail = tail.next;
        }
    }

    public void printCircularList(){
        Node current = tail.next;

            while (current != tail){
                System.out.println(current.data);
                current = current.next;
            }
    }



}
