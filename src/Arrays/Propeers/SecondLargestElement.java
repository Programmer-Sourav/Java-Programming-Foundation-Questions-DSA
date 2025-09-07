package Arrays.Propeers;

public class SecondLargestElement {
    private int getSecondLargest(int arr[]){
      if(arr == null || arr.length < 2) return -1;

      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;


      for (int i = 0; i< arr.length ; i++){
          if(arr[i]> largest){
              secondLargest = largest;
              largest = arr[i];
          }
          else if( arr[i]> secondLargest && arr[i] < largest){
              secondLargest = arr[i];
          }
      }
      return (secondLargest == Integer.MIN_VALUE ? -1 : secondLargest);
    }
    public static void main(String args[]){
        int[] arr = {2, 1, 4, 3, 5, 6, 8, 7};
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        int result = secondLargestElement.getSecondLargest(arr);
        System.out.print("Result "+ result);
    }
}
