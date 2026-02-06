//import static sun.util.locale.LocaleUtils.isEmpty;

public class circularqueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    public circularqueue(int max) {
        arr = new int[max];
        size=max;
        front = rear = -1;
    }
    public void push(int data){
        if(isFull())
            System.out.println("Queue is full");
        else{
            rear=(rear+1)%size;
            arr[rear]=data;

        }
    }
    public int pop(){
        int temp=-1;
        if(isEmpty())
         System.out.println("Queue is empty");
        else{
            temp=arr[(front + 1)%size];
            front=(front+1)%size;
            if(front==rear)
                front=-1;
        }
        return temp;
    }
    public int peek(){
        int temp=-1;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            temp=arr[(front + 1)%size];

        }
        return temp;
    }

    private boolean isFull() {
      return (front == -1 && rear == size - 1) ||(front==rear && rear != - 1);}

    private boolean isEmpty() {
        return rear == front &&  rear==-1;
    }
}
