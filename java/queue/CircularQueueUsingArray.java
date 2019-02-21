package queue;

public class CircularQueueUsingArray {
            /* Problem : Define a Circular Queue Using array. It should follow FIFO with fixed size array.
             *           If Queue is full then first element should be replaced with new element.           */

    int size=5;
    Character[] arr = new Character[size];
    int rear = -1;
    int front= -1;


    public void enqueue(Character data){
        rear = (rear + 1) % size;
        front = (front+1) % size;
        arr[rear] = data;
    }

    public Character dequeue(){
        rear = (rear + 1) % size;
        front = (front+1) % size;
        return arr[front];
    }



    public static void main(String[] args) {

        CircularQueueUsingArray obj = new CircularQueueUsingArray();
        obj.enqueue('A');
        obj.enqueue('B');
        obj.enqueue('C');
        obj.enqueue('D');
        obj.enqueue('E');

        obj.enqueue('F');
        obj.enqueue('G');
        obj.enqueue('H');
        obj.enqueue('I');

        System.out.println(obj.dequeue());

    }
}
