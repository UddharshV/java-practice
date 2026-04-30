package practice_pack.LinkedLists;

public class ElementDeletion {
    public static class Node{
        int data;
        Node next;
        Node(int key){
            data = key;
            next = null;
        }
    }

    public static Node deleteElementFront(Node head){
        head = head.next;
        return head;
    }
    public static Node deleteElementRear(Node head){
        Node curr=head, prev=head;

        if(head==null || head.next==null)
            return null;

        while(curr!=null){
            if(curr.next == null){
                prev.next=null;
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
    public static Node deleteElementSpecificPosition(Node head, int pos){
        Node curr=head;

        if(head==null || head.next==null)
            return null;
        if(pos==1){
            head=head.next;
            return head;
        }
        while(curr!=null){
            if(curr.next!=null && pos==2){
                curr.next=curr.next.next;
                break;
            }
            curr=curr.next;
            pos--;
        }
        return head;
    }

    public static void traverseNodes(Node head){
        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data + " ");
            if(curr.next != null)
                System.out.print("-> ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        traverseNodes(head);
    }
}
