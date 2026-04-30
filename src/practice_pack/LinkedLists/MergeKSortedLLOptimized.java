package practice_pack.LinkedLists;
import java.util.PriorityQueue;

public class MergeKSortedLLOptimized {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        if(lists.length==1)
            return lists[0];
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)->(a.val-b.val));

        for(ListNode list: lists){
            if(list!=null)
                minHeap.add(list);
        }
        ListNode dummyNode = new ListNode(-1);
        ListNode curr=dummyNode;
        while(!minHeap.isEmpty()){
            curr.next=minHeap.peek();
            curr=curr.next;
            ListNode temp = minHeap.poll().next;
            if(temp!=null)
                minHeap.add(temp);
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);
        ListNode res = mergeKLists(new ListNode[] {head1,head2,head3});
        while(res!=null){
            System.out.print(res.val + " ");
            res=res.next;
        }
    }
}
