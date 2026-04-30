package practice_pack.LinkedLists;

public class LinkedListReversal {
    public static class Node{
        int data;
        Node next;
        Node(int key){
            data=key;
            next=null;
        }
    }
    public static Node LLReversal(Node head) {
        Node curr=head, prev=null, next;
        if(head==null)
            return null;
        while(curr!=head){
            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        return prev;
    }
}
