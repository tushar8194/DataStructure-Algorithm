package queue;

import java.util.Arrays;

public class CircularQueueUsingArray {
            /* Problem : Define a Circular Queue Using array. It should follow FIFO with fixed size array.
             *           If Queue is full then first element should be replaced with new element.           */

    int maxSize=5;
    Character[] arr = new Character[maxSize];
    int rear = 0;
    int front= 0;
    int currentSize = 0;


    public void enqueue(Character data){
        if(maxSize == currentSize){
            front = (front+1) % maxSize;
            currentSize--;
        }
        arr[rear] = data;
        rear = (rear + 1) % maxSize;
        System.out.println(" front -> " + front +" rear -> "+ rear + "    adding " + data);
        currentSize++;
    }

    public Character dequeue(){
        char data = arr[front];
        front = (front+1) % maxSize;
        System.out.println(" front -> " + front + " rear -> "+ rear +"    removed " + data);
        currentSize--;
        return data;
    }



    public static void main(String[] args) {

        CircularQueueUsingArray obj = new CircularQueueUsingArray();
        obj.enqueue('A');
        System.out.println(Arrays.toString(obj.arr));
        obj.enqueue('B');
        System.out.println(Arrays.toString(obj.arr));
        obj.enqueue('C');
        System.out.println(Arrays.toString(obj.arr));
        obj.enqueue('D');
        System.out.println(Arrays.toString(obj.arr));
        obj.enqueue('E');
        System.out.println(Arrays.toString(obj.arr));
        obj.enqueue('F');
        System.out.println(Arrays.toString(obj.arr));


        obj.dequeue();
        System.out.println(Arrays.toString(obj.arr));
        obj.enqueue('G');
        System.out.println(Arrays.toString(obj.arr));

        obj.dequeue();
        System.out.println(Arrays.toString(obj.arr));
        obj.dequeue();
        System.out.println(Arrays.toString(obj.arr));

    }
}
