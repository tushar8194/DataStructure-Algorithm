package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    /*Problem : Create a own StackUsingArray using QueueUsingArray ie. QueueUsingArray should follow LIFO */

    Queue<Integer> queueObj = new LinkedList<>();

    public void push(int data){
        if(queueObj.isEmpty()){
            queueObj.add(data);
        }else {
            int size = queueObj.size();
            queueObj.add(data);
            while (size > 0){
                queueObj.add(queueObj.remove());
                size--;
            }
        }

    }

    public int pop(){
        return queueObj.remove();
    }


    public static void main(String[] args) {
        StackUsingQueue obj =new StackUsingQueue();

        obj.push(1);
        obj.push(2);
        obj.push(3);


        // It should print 3,2,1 instead of 1,2,3

        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());


    }


}
