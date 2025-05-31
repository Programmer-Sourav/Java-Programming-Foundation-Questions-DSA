import FindHotelRoomsCount.FindNumberOfRooms;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

         int[] arr = {1,5,7,3,8,9};
         int[] arr2= {1,2,3,4,5,6};
         int[] arr3 = {2,1,7,3,4,6};
         int[] arr4 = {1,2,3,4,5,6,7};
         int[] arr5 = {1,5,11,12,17,9,3};
         int targetSumNos = 15;

         int[] temp = new int[6];

//         BubbleSort bubbleSort = new BubbleSort();
//         bubbleSort.bubbleSort(arr, 6);
//         bubbleSort.bubbleSortImproved(arr, 6);
//         bubbleSort.bubbleSortImproved(arr2, 6);
//
//         SelectionSort selectionSort = new SelectionSort();
//         selectionSort.selection(arr, arr.length);
//         selectionSort.selection(arr3, arr3.length);
//
//         MergeSort mergeSort = new MergeSort();
//         mergeSort.mergeSort(arr3, temp, 0, arr3.length-1);
//
//
//         QuickSort quickSort = new QuickSort();
//         quickSort.QuickSort(arr3, 0, arr3.length - 1);
//
//         UnorderLinearSearch unorderLinearSearch = new UnorderLinearSearch();
//         unorderLinearSearch.unorderedLinearSearch(arr, arr.length -1, 7);
//
//         SortedLinearSearch sortedLinearSearch = new SortedLinearSearch();
//         sortedLinearSearch.sortedLinearSearch(arr, arr4.length-1, 5);
//
////         BinarySearch binarySearch = new BinarySearch();
////         binarySearch.binarySearchIterative(arr, arr.length-1, 4);
////         binarySearch.binarySearchRecursive(arr,0, arr.length -1, 4 );
//
//
//         TargetSum targetSum = new TargetSum();
//         targetSum.findIndicesForTargetSum(arr5, targetSumNos);
//         boolean sumValue = targetSum.twoSumWithTwoPointersSortedArray(arr5, targetSumNos);
//         System.out.println("Sum value "+ sumValue);
//         boolean searchVal = targetSum.twoSumWithBinarySearch(arr5, targetSumNos);
//         if(searchVal)
//         System.out.println("Sum value "+ searchVal);
//         else
//          System.out.println("No");
//        targetSum.findTargetSumWithHashing(arr5, targetSumNos);
//
//        String input = "Screenshot";
//        LongestSubstring longestSubstring = new LongestSubstring();
//        int output = longestSubstring.longestSubstringHS(input);
//        System.out.println("Longest Substring "+ output);
//
//        LongestPalindromSubstring lps = new LongestPalindromSubstring();
//        String lsp = lps.findLongestSubstring("babad");
//        System.out.println(lsp);
//
//        // Example usage:
//            int [] input4 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        MaximumSumSubarray mss = new MaximumSumSubarray();
//        int [] resultmss = mss.maximumSumSubArray(input4);
//        System.out.println("Maximum Sum Subarray:");
//        for (int num : resultmss) {
//            System.out.print(num + " ");
//        }
//
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        FindingMiddleElementOfLL fmol = new FindingMiddleElementOfLL();
//        int midElement = fmol.findMiddleElement(head);
//        System.out.println("\n\n\n Mid Element "+midElement);
//
//        IntersectionPointOfTwoLL pointOfTwoLL = new IntersectionPointOfTwoLL();
//        // Create two linked lists with an intersection
//        ListNode intersect = new ListNode(8);
//        intersect.next = new ListNode(10);
//
//        ListNode headA = new ListNode(4);
//        headA.next = new ListNode(1);
//        headA.next.next = intersect;
//
//        ListNode headB = new ListNode(5);
//        headB.next = new ListNode(6);
//        headB.next.next = new ListNode(1);
//        headB.next.next.next = intersect;
//
//        ListNode result = pointOfTwoLL.findIntersectionPointOfLL(headA, headB);
//        if (result != null) {
//            System.out.println("Intersection at node with value: " + result.data);
//        } else {
//            System.out.println("No intersection found.");
//        }
//
//        List<String> immutableList = Collections.unmodifiableList(new ArrayList<>());
//        immutableList.add(1,"A");
//
//        for(int i = 0; i<immutableList.size(); i++){
//            System.out.println("I "+immutableList.get(i));
//        }
//
//        FrequencyOfWords fqw = new FrequencyOfWords();

        int [] inputA = {10,2,8,3,4,4,5,3,6};
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int [] resultant = productOfArrayExceptSelf.getProductOfTheArray(inputA);
        System.out.print("Product Of Array Except Self "+resultant);

        FindNumberOfRooms findNumberOfRooms = new FindNumberOfRooms();
        String resultantRoomsByTwo = findNumberOfRooms.findNumberOfRooms(6);
        System.out.print("Rooms By 2 "+resultantRoomsByTwo);

    }
}