package linkedlist.singly;

public class LengthOfListEvenOdd {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //list.addElementAtBegining("H");
        list.addElementAtBegining("G");
        list.addElementAtBegining("F");
        list.addElementAtBegining("E");
        list.addElementAtBegining("D");
        list.addElementAtBegining("C");
        list.addElementAtBegining("B");
        list.addElementAtBegining("A");

        System.out.println(isEvenOrOdd(list.head));

    }

    public static String isEvenOrOdd(Node head){
        Node current = head;

        while (current != null){
            if(current.next == null){
                return "odd";
            }else if(current.next.next == null){
                return "even";
            } else {
                current = current.next.next;
            }
        }
        return "Null length";
    }

}
