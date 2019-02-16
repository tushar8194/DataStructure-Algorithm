package stack;

public class StackUsingArray {

    int[] arr;
    int top;
    int maxSize;

    StackUsingArray(int size){
       this.top=-1;
       arr = new int[size];
       this.maxSize=size;
    }


    public void push(int num){
        if(isFull()){
            System.out.println("StackUsingArray is Full!");
        }else {
            arr[++top] = num;
        }
    }

    public int pop(){
        int data =-1;
        if(isEmpty()){
            System.out.println("StackUsingArray is Empty!");
        }else {
            data =  (arr[top--]);
        }
        return data;
    }

    public boolean isFull(){
        return (top == (maxSize - 1));
    }

    public boolean isEmpty(){
        return (top == -1);
    }


    public static void main(String[] args) {

        StackUsingArray st = new StackUsingArray(5);

        // System.out.println(st.isEmpty());

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.push(6);

        while (!st.isEmpty()){
            System.out.println(st.pop());
        }

        st.pop();

    }

}
