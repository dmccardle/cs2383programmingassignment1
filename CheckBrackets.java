import java.util.Scanner;
public class CheckBrackets {
    public static void main(String[] args) {
        Stack s = new Stack(100);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bracket sequence: ");

        String sequence = sc.nextLine();
        // user doesn't enter anything
        if(sequence.isEmpty()) {
            return;
        }

        for(int i = 0; i < sequence.length(); i++) {
            char currentChar = sequence.charAt(i);
            if(currentChar == '(') {
                // For this program, 1's represent an opening bracket
                s.push(1);
            } else if (currentChar == ')') {
                // if you are putting a closing bracket on top of an opening bracket, then those two are balanced
                if(s.top() == 1) {
                    s.pop();
                } else {
                    // For this program, 0's represent a closing bracket
                    s.push(0);
                }
            }
        }

        if(s.empty()) {
            System.out.println("The brackets are balanced");
        } else {
            System.out.println("The brackest are not balanced");
        }

    }
}