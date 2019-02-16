package stack;

import java.util.Stack;

public class QueueUsingStack {

    /* Problem : Create own QueueUsingArray using StackUsingArray. ie StackUsingArray should follow FIFO */

    Stack<Integer> ST1 = new Stack<>();
    Stack<Integer> ST2 = new Stack<>();


    public void enqueue(int data){
        if(ST1.isEmpty()){
            //Simply insert if empty
            ST1.push(data);
        }else {
            // make ST1 empty
            while (!ST1.isEmpty()){
                ST2.push(ST1.pop());
            }

            //put new element
            ST2.push(data);

            // Now take back all elements
            while (!ST2.isEmpty()){
                ST1.push(ST2.pop());
            }
        }

    }

    public int dequeue(){
        return ST1.pop();
    }


    public static void main(String[] args) {

        QueueUsingStack obj = new QueueUsingStack();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);

        // Now if enqueue it should  return 1,2,3,4 instead of 4,3,2,1
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());

    }


}
