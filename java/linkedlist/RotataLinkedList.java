package linkedlist;

public class RotataLinkedList {


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

        list = rotate(list,1);
        System.out.println("----------");
        list.printList();
    }


    public static  LinkedList rotate(LinkedList list,int postition){
        Node current = list.head;
        Node initialHead = list.head;
        Node newHead = null;
        int i = 0;

        while (current != null){

            if(i == (postition-1)){
                newHead = current.next;
                current.next = null;
                current = newHead.next;
            }else {
                if(current.next == null){
                    current.next = initialHead;
                    break;
                }else {
                    current = current.next;
                }
            }
            i++;
        }
        list.head = newHead;

        return list;
    }
}
