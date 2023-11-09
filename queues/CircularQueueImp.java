package queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class CircularQueueImp {

    static class CircularQueue{
        private int rear = -1;
        private int front = -1;
        private int size = 0;
        private int[] queue;

        public CircularQueue(int size){
            queue = new int[size];
        }

        public void add(int ele){
            if (front == -1 && rear == -1){
                front = rear = 0;
            }
            if (size == queue.length){
                System.out.println("Queue is full!!");
                return;
            }
            queue[rear%queue.length] = ele;
            rear++;
            size++;
        }

        public int remove(){
            if (size == 0){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            int val = queue[front%queue.length];
            front++;
            size--;
            return val;
        }

        public int peek(){
            if (size == 0){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return queue[front%queue.length];
        }

        public void display(){
            for (int i=front;i<rear;i++){
                System.out.print(queue[i%queue.length] + " ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.add(10);
        queue.display();
        queue.add(20);
        queue.display();
        queue.add(30);
        queue.display();
        queue.add(40);
        queue.display();
        queue.add(50);
        queue.display();
        queue.remove();
        queue.display();
        queue.remove();
        queue.display();
        queue.remove();
        queue.display();
        queue.add(110);
        queue.display();
        queue.add(120);
        queue.display();
        queue.add(130);
        queue.display();
        queue.add(140);
        queue.display();
    }
}
