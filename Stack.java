public class Stack {
    private int t;
    private int[] A;

    public Stack(int size) {
        t = -1;
        A = new int[size];
    }

    public boolean empty() {
        return t == -1;
    }

    public void push(int x) {
        if(t == A.length)
            System.out.println("Error - stack is full");
        else {
            t = t+1;
            A[t] = x;
        }
    }
    
    public void pop() {
        if(empty()) {
            System.out.println("Error - stack is empty");
        }
        else
            t = t-1;
    }

    public int top() {
        if(empty()) {
            System.out.println("Error - stack is empty");
            return -1;
        }
        else
            return A[t];
    }
}