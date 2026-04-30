package practice_pack.LinkedLists;

import java.util.Arrays;

public class MergeSortedLinkedListsNaive {
    //https://leetcode.com/problems/merge-k-sorted-lists/description/
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
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            int combinedLen = findLengths(list1,list2);
            int[] combinedArr = new int[combinedLen];
            ListNode curr = list1;
            int i=0;
            while(curr!=null){
                combinedArr[i]=curr.val;
                i++;
                curr=curr.next;
            }
            curr=list2;
            while(curr!=null){
                combinedArr[i]=curr.val;
                i++;
                curr=curr.next;
            }
            Arrays.sort(combinedArr);
            return convertArrLL(combinedArr);
        }
        public static ListNode convertArrLL(int[] arr){
            if(arr==null || arr.length==0)
                return null;
            ListNode head = new ListNode(arr[0]);
            ListNode curr = head;
            for(int i=1; i<arr.length; i++){
                curr.next = new ListNode(arr[i]);
                curr = curr.next;
            }
            return head;
        }
        public static int findLengths(ListNode list1, ListNode list2){
            int list1Len=0, list2Len=0;
            ListNode curr = list1;
            while(curr!=null){
                curr=curr.next;
                list1Len++;
            }
            curr=list2;
            while(curr!=null){
                curr=curr.next;
                list2Len++;
            }
            return list1Len+list2Len;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(4);
        ListNode head = mergeTwoLists(head1,head2);
        while(head!=null){
            System.out.print(head.val + " ");
            head=head.next;
        }


    }
}
