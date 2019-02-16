package queue;

public class QueueUsingArray {

    int rear;
    int front;
    int[] arr;
    int maxSize;


    // Define constructor
    public QueueUsingArray(int size){
        this.front = 0;
        this.rear = -1;
        arr = new int[size];
        maxSize = size;
    }

    public void enQueue(int num){
        if(!isFull()){
            arr[++rear] = num;
        } else {
            System.out.println("QueueUsingArray is Full!");
        }
    }

    public int deQueue(){
        if(!isEmpty()){
            return (arr[front++]);
        }else {
            System.out.println("QueueUsingArray is Empty!");
            return -1;
        }

    }

    public boolean isEmpty(){
        boolean status = false;
        if(front > rear){
            status = true;
        }else if (front > maxSize){
            front = 0;
            rear = -1;
            status = true;
        }
        return status;
    }

    public boolean isFull(){

        return (rear == (maxSize-1));
    }




    public static void main(String[] args) {
        QueueUsingArray qu = new QueueUsingArray(5);

        qu.enQueue(1);
        qu.enQueue(2);
        qu.enQueue(3);
        qu.enQueue(4);
        qu.enQueue(5);

        qu.enQueue(6);

        while (!qu.isEmpty()){
            System.out.println(qu.deQueue());
        }

        qu.deQueue();

    }


}
