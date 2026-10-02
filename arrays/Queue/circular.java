package arrays.Queue;

public class circular {
    static class queue{
        static  int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n){
            arr = new int [n];
            size = n;
            rear =-1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear ==-1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)% size == front;
        }
        // add 
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
        if(front ==-1){
            front =0;
        }
        rear = (rear+1)% size;
        arr[rear] =data;
     }
     // remove 
     public static int remove(){
        i
     }


     }
    
}
