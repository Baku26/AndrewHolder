import java.util.ArrayList;
import java.util.LinkedList;

public class AndrewHolder {
    
    ArrayList<Integer> someList = new ArrayList<>();
    LinkedList<Integer> someList = new LinkedList<>();
    private String[] bucket;
    private int size;
    
    public AndrewHolder() {
        bucket = new String[10];
        size = 0;
    }

        public void addToBucket(String someUserInputString) {
          if ( size == bucket.length) {
          bucket[size] = someUserInputString;
          doubleBucketSize();
          size++;
        }
    }
        public int size() {
            return size;
        }
        public void getStringAtIndex(int index) {
            System.out.println(bucket[index]);
    
    }
    public void clearBucket() {
        bucket = new String[10];
        size = 0;
    }
    public void printAll() {
        for (int i = 0; i < bucket.length; i++) {
        System.out.println("[" + bucket[i] + "]");
    }
}
     public void addToIndex( int index, String someUserInputString) {
         if (size == bucket.length) {
            doubleBucketSize();
          bucket[index] = someUserInputString;
             
         }
        } 
         public void replaceAtIndex(int index, String someUserInputString) {
           if ( size == bucket.length) {
               doubleBucketSize();
               bucket[index] = someUserInputString;
           }
         }
    
     public void find(String someUserInputString) {
         for ( int i = 0; i < size - 1; i++) {
             if(bucket[i].equalsIgnoreCase(someUserInputString)) {
                 System.out.println(someUserInputString + "this is in the array");
             }
         }
     }
    public void findCount(String someUserInputString) {
        int count = 0;
        for ( int i = 0; i < size - 1; i++) {
            if (bucket[i].equalsIgnoreCase(someUserInputString)) {
                count++;
                
            }
    }
    System.out.println(someUserInputString + "has been found in the array " + count + "times");
     
}
public void removeAtIndex( int index) {
    bucket[index] = null;
    for ( int i = index; i < size - 1; i++) {
        bucket[i] = bucket[i + 1];
    }
    bucket[size - 1] = null;
    size--;
}
public void doubleBucketSize() {
 String[] bucket2 = new String[bucket.length * 2];
 for(int i = 0; i < bucket.length; i++) {
     bucket2[i] = bucket[i];
 }
 bucket = bucket2;
}
public void addToEnd(String someUserInputString ) {
    if (size == bucket.length) {
        doubleBucketSize();
    }
    bucket[size] = someUserInputString;
    size++;
}
public AndrewHolder cloneClass() {
   AndrewHolder andrewCopy = new AndrewHolder();
   andrewCopy.bucket = new String[this.bucket.length];
   for(int i = 0; i < size; i++) {
       andrewCopy.bucket[i] = this.bucket[i];
   }
   andrewCopy.size = this.size;
   return andrewCopy;
}
public String[] getBucket() {
    String[] arrayValues = new String[size];
    for(int i = 0; i < size; i++) {
        arrayValues[i] = bucket[i];
    }
    return arrayValues;
  }


            }
        
