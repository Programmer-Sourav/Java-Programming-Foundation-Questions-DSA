package Arrays;

public class CustomDynamicArray {
    /**
     * There will be an array with initial capacity
     * If capacity is filled, then size doubles
     * A new array is created with the doubled size
     * Old elements are copied
     *
     * **/
    /***
     * Internally, ArrayList in Java doubles its capacity when the existing array is full.
     * The default capacity is 10. When it exceeds, it expands to (oldCapacity * 1.5).
     */
    /**
     *
     * ✅ ArrayList is a flexible alternative to arrays in Java.
     * ✅ Handles resizing automatically using capacity doubling.
     * ✅ Efficient for random access (O(1)) but slower than LinkedList for frequent insertions/removals in the middle.
     * ✅ Custom dynamic arrays allow control over memory and resizing but require manual handling.
     *
     */
    int [] arr;
    int capacity;
    int size;

    CustomDynamicArray(int initialCapacity){ //constructor to initialize the capacity, arr and initial size.
       this.capacity = initialCapacity;
       arr = new int[capacity];
       size =0; //index
    }

    public void add(int element){
        if(size == capacity){
            resize();   //once initial array is filled, it triggers resizing of the array
        }
        arr[size++] = element;
    }

    public void resize(){
        int newCapacity = capacity *2;  //double the capacity
        int [] newArr = new int[newCapacity]; //create a new array with new capacity

        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];    //copy the elements
        }

        arr = newArr; //assign newArr to the arr variable
        capacity = newCapacity; // assign new capacity as the capacity
    }

    public int get(int i){
        if(i>=size) throw  new ArrayIndexOutOfBoundsException(); //index exceeds array length
        return arr[i];
    }

    public int size(){
        return size;
    }

    public void printArray(){
        for(int i =0; i<arr.length; i++){
            System.out.print("Elements "+ arr[i]);
        }
    }

    public static void main(String[] args) {
        CustomDynamicArray dynamicArray = new CustomDynamicArray(2);

        dynamicArray.add(5);
        dynamicArray.add(10);
        dynamicArray.add(15); // Triggers resizing

        dynamicArray.get(2);
        System.out.print("Elements: ");
        dynamicArray.printArray();

        System.out.println("Size: " + dynamicArray.size());
    }
}
