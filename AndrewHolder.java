
public class AndrewHolder {
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
            bucket[size - 1] = null;
            size--;
        }
          public int size() {
        return size;
    }
    public String get(int index) {
          if( index >= 0 && index < size) {
              return bucket[index];
          }
          return null;
        }
        public void print() {
                System.out.println("[");
                for(int i = 0; i < size; i++) {
                    System.out.print(bucket[i]);
                    if (i < size - 1) {
                        System.out.print(",");
                    }
            }
            System.out.print("]");
        }
        public void clear() {
            bucket = new String[10];
            size = 0;
        }
        private void ensureCapacity() {
            if (size == bucket.length) {
                String[] newBucket = new String[bucket.length * 2];
                for(int i = 0; i< bucket.length; i++){
                    newBucket[i] = bucket[i];
                }
                bucket = newBucket;
                }
            }
            public void addToEnd(String someUserInputString) {
                ensureCapacity();
                bucket[size] = someUserInputString;
                size++;
                
            }
            public AndrewHolder cloneClass() {
             AndrewHolder copy = new AndrewHolder();
             
             copy.bucket = new String[this.bucket.length];
             
             for ( int i = 0; i < this.size; i++) {
                 copy.bucket[i] = this.bucket[i];
             }
             copy.size = this.size;
             return copy;
              }
              public String[] getBucket() {
                  return bucket;
              }
              public void replace(String someUserInputString, int position) {
                  if( position < 0 || position >= size) {
                      return;
                  }
                  bucket[position] = someUserInputString;
              }
              public boolean find(String valueToFind) {
                  for(int i = 0; i < size; i++) {
                      if (bucket[i] != null && bucket[i].equals(valueToFind)) {
                          return true;
                      }
                  }
                  return false;
                }
                public int findCount(String valueToCount) {
                    int count = 0;
                    
                    for (int i = 0; i < size; i++) {
                    if (bucket[i] != null && bucket[i].equals(valueToCount)) {
                        count++;
                    }
                
                else if (bucket[i] == null && valueToCount == null) {
                    count++;
                 }
                }
                return count;
            
            }
    
            
        }
        
