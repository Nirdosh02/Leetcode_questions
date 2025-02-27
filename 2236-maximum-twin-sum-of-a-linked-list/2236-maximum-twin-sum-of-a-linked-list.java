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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int cnt=0;
        while(fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            cnt++;
        }
        ListNode temp2 = reverseList(slow.next);
        fast=head;
        int ans=0;
        for(int i=0; i<=cnt; i++){
            int sum = fast.val + temp2.val;
            ans=Math.max(ans, sum);
            fast=fast.next;
            temp2=temp2.next;
        }
        return ans;
    }
    public ListNode reverseList(ListNode head) {
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
}