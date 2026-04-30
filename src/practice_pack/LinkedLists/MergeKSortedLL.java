package practice_pack.LinkedLists;

public class MergeKSortedLL {
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
        ListNode prev=lists[0];
        for(int i=1; i<lists.length; i++){
            lists[i]=mergeTwoLists(prev,lists[i]);
            prev=lists[i];
        }
        return lists[lists.length-1];
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1, temp2=list2;
        ListNode dummyNode=new ListNode(-1);
        ListNode curr = dummyNode;
        while(temp1!=null && temp2!=null){
            if(temp1.val < temp2.val){
                curr.next=temp1;
                curr=temp1;
                temp1=temp1.next;
            }
            else{
                curr.next=temp2;
                curr=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1!=null)
            curr.next=temp1;
        if(temp2!=null)
            curr.next=temp2;

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
