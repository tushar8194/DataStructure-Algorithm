package hackerrank;

public class HRLinkedListDeleteDuplicate {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addElementAtBegining("D");
        list.addElementAtBegining("C");
        list.addElementAtBegining("B");
        list.addElementAtBegining("B");
        list.addElementAtBegining("B");
        list.addElementAtBegining("A");
        list.printList();
        System.out.println("----------");
        removeDuplicates(list.head);
        list.printList();


    }

    public static Node removeDuplicates(Node head){
        Node current = head;

        while (current != null && current.next != null){
            if(current.data == current.next.data){
                if(current.next.next != null){
                    current.next = current.next.next;
                }else {
                    current.next = null;
                }
            } else {
                current = current.next;
            }
        }
        return head;
    }


}
