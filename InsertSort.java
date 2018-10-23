public class InsertSort {
    public static void main(String[] args) {
        int[] A = {7, 4, 8, 2, 5, 3, 9};
        sort(A);
        show(A);
    }
    /** 
     * Sorts the array passed in using insertion sort 
     * @param A the array
     */
    public static void sort(int[] A) {
        for(int j = 1; j < A.length; j++) {
            int y = A[j];
            int i = j-1;
            while(i >= 0 && y < A[i] ) {
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = y;
        }
    }

    /** 
     * Print out the current array 
     * @param A the array
     */
    public static void show(int[] A) {
        System.out.print("Array: {");
        for(int i = 0; i < A.length-1; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.print(A[A.length-1] + "}" );
    }
}