import java.util.ArrayList;
import java.util.LinkedList;

public class AndrewHolder {

    private Bucket head;
    
    ArrayList<Integer> someList = new ArrayList<>();
    LinkedList<Integer> someList = new LinkedList<>();
  
    public AndrewHolder() {
       head = null;
    }

        public void add(String name) {
           Bucket newBucket = new Bucket(name);
          if ( head == null) {
              head = newBucket;
              else {
            Bucket current = head;
            while (current.getNextBucket() != null) {
                current = current.getNextBucket();
            }
    
            current.setNextBucket(newBucket); 
        }
    }
    public void printBucket() {
        if (head == null) {
            System.out.println("The bucket is empty for now.");
            return; 
        }
        
        Bucket current = head;
        
        
          
        System.out.println("the bucket amount is :");
        while (current !=null) {
            System.out.println("[" + current.getBucketSize()+"]->");
            current = current.getNextBucket();
            
            
        }
        System.out.println("the end");
    }
}

 private String bucket[];
    private int size;
    
    public AndrewHolder() {
        bucket = new String[10];
        size = 0;
    }

        public void addToBucket(String someUserInputString) {
        ensureCapacity();
        bucket[size] = someUserInputString;
        size++;
       }
       
    public void add(String someUserInputString, int position) {
        if (position < 0 || position > size) {
            return;
        }
        ensureCapacity();
        for(int i = size; i > position; i--) {
            bucket[i] = bucket[i-1];
            
           }
           bucket[position] = someUserInputString;
           size++;
        }
        public void remove(int position) {
            if (position < 0 || position >= size) {
                return;
            }
            for(int i = position; i < size - 1; i++) {
                bucket[i] = bucket[i+1];
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
        
