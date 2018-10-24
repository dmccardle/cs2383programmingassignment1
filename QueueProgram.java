import java.util.Scanner;
public class QueueProgram {
    public static void main(String[] args) {
        System.out.print("Enter the size of the queue: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println();

        Queue q = new Queue(size);

        // Program will exit if the user presses Ctrl+C
        while(true) {
            System.out.println("Enter a value (int > 0 to enqueue, int < 0 for front, int = 0 to dequeue): ");
            int input = sc.nextInt();

            if(input > 0) {
                q.enqueue(input);
            } else if(input < 0) {
                int front = q.front();
                // Checks to make sure an "exception" wasn't thrown. (I return -1 if the queue is full)
                if(front > 0)
                    System.out.println("Front of Queue: " + front);
            } else {
                q.dequeue();
            }
        }
    }
}