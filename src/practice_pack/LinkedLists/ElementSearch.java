package practice_pack.LinkedLists;

public class ElementSearch {
    public static class Node{
        int data;
        Node next;
        Node(int key){
            data = key;
            next = null;
        }
    }
    public static boolean searchEle(Node head, int ele){
        Node curr = head;
        if(head==null)
            return false;
        while(curr!=null){
            if(curr.data==ele)
                return true;
            curr=curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
    }
}
