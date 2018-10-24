import java.util.Scanner;
public class StackProgram {
    public static void main(String[] args) {
        System.out.print("Enter the size of the stack: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println();

        Stack s = new Stack(size);

        // Program will exit if the user presses Ctrl+C
        while(true) {
            System.out.println("Enter a value (int > 0 to push, int < 0 for top, int = 0 to pop): ");
            int input = sc.nextInt();

            if(input > 0) {
                s.push(input);
            } else if(input < 0) {
                int top = s.top();
                // Checks to make sure an "exception" wasn't thrown. (I return -1 if the stack is full)
                if(top > 0)
                    System.out.println("Top of stack: " + top);
            } else {
                s.pop();
            }
        }
    }
}