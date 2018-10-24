public class Stack {
    private int top;
    private int[] A;

    /**
     * Intializes the stack (equivalent to stack_init())
     * @param size the size of the array
     */
    public Stack(int size) {
        top = -1;
        A = new int[size];
    }

    public boolean empty() {
        return top == -1;
    }

    public void push(int x) {
        if(top == A.length)
            System.out.println("Error - stack is full");
        else {
            top = top+1;
            A[top] = x;
        }
    }
    
    public void pop() {
        if(empty()) {
            System.out.println("Error - stack is empty");
        }
        else
            top = top-1;
    }

    public int top() {
        if(empty()) {
            System.out.println("Error - stack is empty");
            return -1;
        }
        else
            return A[top];
    }
}