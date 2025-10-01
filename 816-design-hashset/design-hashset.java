class Bucket{
    private List<Integer> container;
    public Bucket(){
        this.container = new LinkedList<Integer>();
    }

    public void insert(Integer val){
        int index = this.container.indexOf(val);
        if(index == -1){
            this.container.addFirst(val);
        }
    }

    public void remove(Integer val){
        this.container.remove(val);
    }

    public boolean contains(Integer val){
        int index = this.container.indexOf(val);
        return index != -1;
    }
}

class MyHashSet {
    int numBuckets = 827;
    Bucket[] buckets;
    public MyHashSet() {
        this.buckets = new Bucket[this.numBuckets];
        for(int i=0; i<numBuckets; i++){
            this.buckets[i] = new Bucket();
        }
        
    }
    

    private int getIndex(int key){
        return key % numBuckets;
    }


    public void add(int key) {
        int bucketIndex = this.getIndex(key);
        this.buckets[bucketIndex].insert(key);
    }
    
    public void remove(int key) {
        int bucketIndex = this.getIndex(key);
        this.buckets[bucketIndex].remove(key);

    }
    
    public boolean contains(int key) {
        int bucketIndex = this.getIndex(key);
        return this.buckets[bucketIndex].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */