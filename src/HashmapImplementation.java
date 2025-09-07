import java.util.ArrayList;

public class HashmapImplementation {

//    Internally, a HashMap uses an array of buckets or bins.
//    Each bucket is a linked list of type Node, which is used to represent the key-value pair of the HashMap.
//    So, Basically Bucket is an Array of LinkedList

//    This method inserts a new key-value pair to the HashMap.
//    The insertion order of the key-value pairs is not maintained.
//    During insertion, if a key is already present, the existing value will be replaced with the new value that is passed.
//    You can insert only one null key into the HashMap, but you can have multiple null values.
// This is your array of buckets (each bucket is a linked list via BucketNode)
private static final int BUCKET_SIZE = 31;
private ArrayList<BucketNode> buckets = new ArrayList<>(BUCKET_SIZE);


    public HashmapImplementation() {
        // Fill the list with nulls initially
        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets.add(null);
        }
    }


    private ArrayList<BucketNode> getABucketList(BucketNode nodeWithData){
        BucketNode bucketNode = getABucket(nodeWithData);
        ArrayList<BucketNode> arrBucket = new ArrayList<>();
        arrBucket.add(bucketNode);
        return arrBucket;
    }
    private BucketNode getABucket(BucketNode node){
        BucketNode head = null;
        //{value, address} to each node and link the next node to the address
        //Basically, giving values to the BucketNode
        if(head==null){
            head = node;
        }
        else{
            head.next = node;
        }
       return head;
    }

    public void put(String key, Object value){
        // it will calculate the hashcode for the key
        //It will search index in the array bucket based on the Hashcode.
        //if index matches, it will add the element.
       int hashKey = calculateHashCodeForKey(key); //probably the object key
        BucketNode bucketNode = new BucketNode(key, value);
       // ArrayList<BucketNode> bucketList = getABucketList(bucketNode);

        // Get the head of the linked list at that index
        BucketNode head = buckets.get(hashKey);

        if (head == null) {
            // No node yet at this bucket — insert directly
            buckets.set(hashKey, bucketNode);
        } else {
            // Traverse linked list to find if key exists
            BucketNode current = head;
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value; // Update value
                    return;
                }
                if (current.next == null) break;
                current = current.next;
            }
            // Key not found — add new node to end
            current.next = bucketNode;
        }

    }

    public Object get(String key){
        int index = getIndex(key);
        BucketNode current = buckets.get(index);
        System.out.print("Current "+ current.value);
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null; // key not found
    }

    int INITIAL_CAPACITY = 31;
    private int getIndex(String key) {
        int hash = 0;
        int prime = 31;

        // Simple hash function based on characters
        for (int i = 0; i < key.length(); i++) {
            hash = hash * prime + key.charAt(i);
            System.out.print("\n Hash2 "+ hash);
        }

        return Math.abs(hash % prime);
    }

    private int calculateHashCodeForKey(String key){
        //apply a hashfunction
        int anyPrimeNumber = 31;
        int hashCode = 0;
        try {
            hashCode = Integer.parseInt(key) % anyPrimeNumber;
            //if passing "apple" as a key, so it should be a NumberFormatException
            //In that case, need to generate some random key or may be there should be some way or pattern
            //suppose for each character some value can be assigned to generate a int key.
        }
        catch (NumberFormatException exception){
            System.out.print("\n Input Key is not a Number "+ exception);

            for(int i =0; i<key.length(); i++){
                char ch = key.charAt(i);
                hashCode = hashCode*anyPrimeNumber + ch;
                System.out.print("\n Hash1 "+ hashCode);
            }
            hashCode = Math.abs(hashCode % anyPrimeNumber);
        }

        return hashCode;
    }

    public static void main(String args[]){
        HashmapImplementation hashmapImplementation = new HashmapImplementation();
        hashmapImplementation.put("apple", 100);
        hashmapImplementation.put("banana", 200);
        hashmapImplementation.put("apple", 300); // Test key overwrite
        hashmapImplementation.put("1", 111);
//        hashmapImplementation.put("2", 222);
//        hashmapImplementation.put("3", 333); // Test key overwrite
//        hashmapImplementation.put("4", 121);
//        hashmapImplementation.put("5", 221);
//        hashmapImplementation.put("6", 321); // Test key overwrite
//        hashmapImplementation.put("7", 131);
        hashmapImplementation.put("kiwi", 231);
        hashmapImplementation.put("banana", 331); // Test key overwrite
        hashmapImplementation.put("strawberry", 141);
//        hashmapImplementation.put("vanilla", 241);
        hashmapImplementation.put("strawberry", 342); // Test key overwrite

        System.out.print("\n HashMap Remove method, ");
        System.out.print("\n Strawberry");
        hashmapImplementation.get("strawberry");
        System.out.print("\n apple");
        hashmapImplementation.get("apple");
        System.out.print("\n 1");
        hashmapImplementation.get("1");
//        System.out.print("2");
//        hashmapImplementation.get("2");
//        System.out.print("3");
//        hashmapImplementation.get("3");
//        System.out.print("4");
//        hashmapImplementation.get("4");
//        System.out.print("5");
//        hashmapImplementation.get("5");
//        System.out.print("7");
//        hashmapImplementation.get("7");
        System.out.print("\n Kiwi");
        hashmapImplementation.get("kiwi");
        System.out.print("\n Banana");
        hashmapImplementation.get("banana");
//        System.out.print("Vanilla");
//        hashmapImplementation.get("vanilla");



    }
}

class BucketNode{
    String key;
    Object value;
    BucketNode(String key, Object value){
        this.key = key;
        this.value = value;
    }

    BucketNode next;
}


