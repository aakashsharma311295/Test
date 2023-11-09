package queues;

public class ArrayImplementation {

    static class Queue{
        private int[] queue;
        private int front = -1;
        private int rear = -1;
        private int size = 0;
        public Queue(int size){
            queue = new int[size];
        }

        public void add(int ele){
            if (rear == queue.length){
                System.out.println("Queue is full!!");
                return;
            }
            if (front == -1 && rear == -1){
                front = rear = 0;
            }
            queue[rear++] = ele;
            size++;
        }

        public int remove(){
            if (size == 0){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            int val = queue[front];
            front++;
            size--;
            return val;
        }

        public int peek(){
            if (size == 0){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return queue[front];
        }

        public void display(){
            if (size == 0){
                System.out.println("Queue is Empty!!");
                return;
            }
            for (int i=front;i<rear;i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        q.add(110);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();


    }
}
