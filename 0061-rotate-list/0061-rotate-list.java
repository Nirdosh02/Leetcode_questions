/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode tail = head;
        int len = 1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        k=k%len;
        if(k==0) return head;
        
        ListNode temp=head;
        int nl = len-k;
        for(int i=1; i<nl; i++){ temp=temp.next;}
        ListNode newN = temp.next;
        temp.next=null;
        
        tail.next=head;
        

        return newN;
    }
}