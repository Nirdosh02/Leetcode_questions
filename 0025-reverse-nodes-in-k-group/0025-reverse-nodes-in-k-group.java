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
    public ListNode getkth(ListNode temp, int k){
        k-=1;
        while(temp!=null && k>0){ k--;
        temp=temp.next;}
        return temp;
    }
    public ListNode reverseLinkedList(ListNode head) {
        ListNode p=head;
        ListNode q=null;
        ListNode r=null;

        while(p!=null){
            r=q;
            q=p;
            p=p.next;
            q.next=r;

        }
        return q;
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode knode = getkth(temp, k);
            if(knode==null){
                if(prev!=null){ 
                    prev.next=temp;
                    break;
                }
            }
            ListNode next = knode.next;
            knode.next = null;
            reverseLinkedList(temp);
            if(temp==head){ head=knode;}
            else{ prev.next=knode;}
            prev = temp;
            temp = next;
        }
        return head;
    }
}