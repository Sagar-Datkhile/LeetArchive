import java.util.HashMap;

class LRUCache {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        
        Node() {}
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    private final int capacity;
    private final HashMap<Integer, Node> map;
    
    private final Node head;
    private final Node tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
         moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        
        if (node != null) {
             node.value = value;
            moveToHead(node);
        } else {
             Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);
            
             if (map.size() > capacity) {
                Node lru = tail.prev;
                removeNode(lru);
                map.remove(lru.key);
            }
        }
    }
    
     private void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    
     private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
     private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }
}

 