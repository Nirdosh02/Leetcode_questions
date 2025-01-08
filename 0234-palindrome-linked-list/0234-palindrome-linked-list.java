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
    public ListNode reverse(ListNode head){
        if(head==null || head.next == null) return head;
        ListNode newhead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null ) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next != null){
            fast=fast.next.next;
            slow = slow.next;
        }
        ListNode newhead = reverse(slow.next);
        ListNode first = head;
        ListNode sec = newhead;
        while(sec!=null){
            if(first.val != sec.val){
                reverse(newhead);
                return false;
            }
            first=first.next;
            sec=sec.next;
        }
        reverse(newhead);
        return true;
    }
}