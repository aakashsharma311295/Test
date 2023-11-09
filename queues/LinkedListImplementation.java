package queues;

public class LinkedListImplementation {
    static class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
    }

    static class Queue{
        private Node front = null;
        private Node rear = null;
        private int size = 0;

        public void add(int ele){
            Node temp = new Node(ele);
            if (front == null && rear == null){
                front = rear = temp;
            }else {
                rear.next = temp;
                rear = temp;
            }
            size++;
        }
        public int remove(){
            if (size == 0){
                System.out.println("Queue is empty!!");
                return -1;
            }
            int val = front.val;
            front = front.next;
            size--;
            return val;
        }

        public int peek(){
            if (size == 0){
                System.out.println("Queue is empty!!");
                return -1;
            }
            return front.val;
        }

        public void display(){
            if (size == 0){
                System.out.println("Queue is empty!!");
                return;
            }
            Node temp = front;
            while (temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
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
        q.remove();
        q.remove();
        q.remove();
        q.display();
    }
}
