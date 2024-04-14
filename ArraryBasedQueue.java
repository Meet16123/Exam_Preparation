class Queue {
    static  int front, rear , capacity;
    static  int queue[];

    Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    static void enque(int data) {
            if(capacity == rear) {
                System.out.println("Full");
                return;
            } else {
                queue[rear] = data;
                rear++;
            }
            return;
    }

    static void deque() {
        if(front == rear) {
            System.out.println("Empty");
            return;
        } else {

        }

    }


}

public class ArraryBasedQueue {
    public static void main(String[] args) {

    }
}
