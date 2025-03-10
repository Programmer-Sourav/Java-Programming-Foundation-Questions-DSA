package basic_string_manipulation;

public class RotateAnArray {

    public static void main(String [] args){
        //console.log(rotateArray([1, 2, 3, 4, 5], 2)); // [4, 5, 1, 2, 3]
        int [] numbers = new int[]{1, 2, 3, 4, 5};
        int toRotate = 2;
        int indexToBeSelected = numbers.length - toRotate;
        //split the array in 2 haves
        //put(copy) the second part in a new array and then put(copy) the first part in a new array
        // Create a new array to hold the rotated result
        int [] rotatedArray = new int[numbers.length];

        // Copy the second part (from indexToBeSelected to end) into the new array
        int currentIndex = 0;
        for(int i = indexToBeSelected; i< numbers.length; i++){
            rotatedArray[currentIndex++] = numbers[i];
        }
        // Copy the first part (from start to indexToBeSelected - 1) into the new array
        for(int i = 0; i<indexToBeSelected; i++){
            rotatedArray[currentIndex++] = numbers[i];
        }
       //print the rotated array
        for(int number : rotatedArray){
            System.out.print(number + " ");
        }
    }
}
