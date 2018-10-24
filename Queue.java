public class Queue {
    private int front;
    private int rear;
    private int[] Q;

    /**
     * Intializes the queue (equivalent to queue_init())
     * @param size the size of the array
     */
    public Queue(int size) {
        front = rear = -1;
        Q = new int[size];
    }

    public boolean empty() {
        return rear == -1;
    }

    public void enqueue(int x) {
        if(empty()) {
            rear = front = 0;
            Q[front] = x;
        } else {
            rear = rear+1;
            if(rear == Q.length)
                rear = 0;
            if(rear == front) {
                System.out.println("Error - Queue is full");
                return;
            }
            else
                Q[rear] = x;
        }
    }

    public void dequeue() {
        if(empty()) {
            System.out.println("Error - Queue is empty");
            return;
        }
        if(rear == front)
            rear = front = -1;
        else {
            front++;
            if(front == Q.length)
                front = 0;
        }
    }

    public int front() {
        if(empty()) {
            System.out.println("Error - Queue is empty");
            return -1;
        }
        return Q[front];
    }


}