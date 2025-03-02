class LRUCache {

    Node head = new Node(0,0), tail = new Node(0,0);
    Map<Integer, Node> mp = new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            Node node = mp.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{ return -1;}
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){ remove(mp.get(key));}
        if(mp.size()==capacity){ remove(tail.prev);}
        insert(new Node(key, value));
    }
    public void remove(Node node){
        
        if(node.prev!=null && node.next!=null){node.prev.next = node.next;
        node.next.prev = node.prev;}

        mp.remove(node.key);
    }

    private void insert(Node node){
        mp.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    class Node{
        Node prev, next;
        int key, value;
        Node(int _key, int _value){
            key = _key;
            value = _value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */