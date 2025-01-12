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
    // public ListNode reverseList(ListNode head) {
    //     ListNode p=head;
    //     ListNode q=nullptr;
    //     ListNode r=nullptr;
    //     while(p!=nullptr){
    //         r=q;
    //         q=p;
    //         p=p->next;
    //         q->next=r;
    //     }
    //     return q; 
    // }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=1; i<left; i++){
            prev=prev.next;
        }
        ListNode temp = prev.next;
        ListNode p = temp;
        ListNode q = null;
        ListNode r=null;
        for(int i=left; i<=right; i++){
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }
        prev.next=q;
        temp.next=p;

        return dummy.next;


    }
}