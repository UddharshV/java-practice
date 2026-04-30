package practice_pack.LinkedLists;

public class ElementInsertion {
    public static class Node{
        int data;
        Node next;
        Node(int key){
            data = key;
            next = null;
        }
    }

    public static Node insertElementFront(Node head, int ele){
        Node temp = new Node(ele);
        temp.next= head;
        head = temp;

        return head;
    }

    public static Node insertElementRear(Node head, int ele){
        Node curr=head;
        if(head==null)
            head = new Node(ele);
        while(curr !=null){
            if(curr.next == null){
                curr.next=new Node(ele);
                break;
            }
            curr=curr.next;
        }
        return head;
    }

    public static Node insertElementSpecificPosition(Node head, int pos, int ele){
        Node curr=head;
        if(head==null)
            head = new Node(ele);
        while(curr !=null){
            if(pos==2){
                Node temp = curr.next;
                curr.next = new Node(ele);
                curr.next.next=temp;
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
        System.out.println("LL before insertion: ");
        traverseNodes(head);
        System.out.println("LL after deletion: ");
        head=insertElementSpecificPosition(head, 3,3);
        traverseNodes(head);
    }
}
