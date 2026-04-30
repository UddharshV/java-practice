package practice_pack.leetcode_prep;

import java.util.HashMap;

public class LFUCache {
    public class Node{
        Node prev;
        int key;
        int val;
        Node next;
        public Node(){
            prev=null;
            this.key=key;
            this.val=val;
            next=null;
        }
    }
    final Node head = new Node();
    final Node tail = new Node();

    HashMap <Integer, Node> cacheNodes;

    int maxCapacity;

    public LFUCache(int capacity) {
        this.maxCapacity = capacity;
        cacheNodes = new HashMap(maxCapacity);
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key) {
        if(!cacheNodes.containsKey(key))
            return -1;
        Node node = cacheNodes.get(key);
        int res = node.val;
        removeLL(node);
        addLL(node);
        return res;
    }

    public void put(int key, int value) {
        Node node = cacheNodes.get(key);
        //cache miss -> element not in cache
        if(node==null){
            node = new Node();
            node.key = key;
            node.val = value;
            if(cacheNodes.size()<maxCapacity){
                addLL(node);
                cacheNodes.put(key, node);
            }
            else{
                cacheNodes.remove(tail.prev.key); //remove last node from cache
                removeLL(tail.prev); //remove Last LL Node
                addLL(node);
                cacheNodes.put(key,node);
            }
        }
        else{
            removeLL(node);
            node.val = value; //update new value of key to node (Hashmap does not need any updation as it references the updated node)
            addLL(node);
        }
    }
    public void addLL(Node newNode){
        //always add LL nodes at the beginning
        //NOTE: headNext's pointer is stored in head.next
        Node headNext = head.next; //We now have a headNext node pointing to the 1st node(referenced by head.next)

        head.next = newNode;
        newNode.next = headNext;
        headNext.prev = newNode;
        newNode.prev = head;
    }
    public void removeLL(Node currNode){
        Node prevNode = currNode.prev; //We now have a prevNode which is before the current node
        Node nextNode = currNode.next; //We now have a nextNode which is after the current node

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
}
