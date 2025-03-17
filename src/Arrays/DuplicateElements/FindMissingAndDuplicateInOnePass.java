package Arrays.DuplicateElements;

public class FindMissingAndDuplicateInOnePass {

    /**
     * Problem	Best Approach	Time Complexity	Space Complexity
     * Missing Number	XOR or Sum Formula	O(n)	O(1)
     * Find Duplicate	Floyd’s Cycle Detection	O(n)	O(1)
     * Missing & Duplicate	Sum & Square Sum	O(n)	O(1)
     */

    public static int[] findMissingAndDuplicate(int arr[]){
        int n = arr.length;
        int sumN = (n*(n+1))/2;
        int sumSqN = (n*(n+1)*(2*n+1))/6; //n*n + 2n + 2

        int sumA = 0, sumSqA = 0;

        for(int element : arr){
            sumA = sumA + element;
            sumSqA = sumSqA + (element * element);
        }
        int diff = sumN - sumA; //x-y
        int diffSumSqN = sumSqN - sumSqA; //x*x - y*y, (x+y)(x-y)

        int sum = diffSumSqN/diff; /**(x+y)**/
        int x = (sum + diff)/2; // Missing number
        int y = sum -x; // Duplicate number


       return new int[]{y,x}; // [Duplicate, Missing]

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] result = findMissingAndDuplicate(arr);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}
