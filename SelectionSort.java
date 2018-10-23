public class SelectionSort {
    public static void main(String[] args) {
        int[] A = {7, 4, 8, 2, 5, 3, 9};
        sort(A);
        show(A);
    }
    /** 
     * Sorts the array passed in using selection sort 
     * @param A the array
     */
    public static void sort(int[] A) {
        for(int i = 0; i < A.length; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < A.length; j++) {
                if(A[j] < A[smallestIndex])
                    smallestIndex = j;
            }
            swap(A, i, smallestIndex);
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

    /** 
     * Swap the two values at the specified indexes. Put the smallest one into the current one.
     * @param A the array
     * @param currentIndex the destination index
     * @param smallestIndex the index of the value to swap
     */
    public static void swap(int[] A, int currentIndex, int smallestIndex) {
        int temp = A[currentIndex];
        A[currentIndex] = A[smallestIndex];
        A[smallestIndex] = temp;
    }
}