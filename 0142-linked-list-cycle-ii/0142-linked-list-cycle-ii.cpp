/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *temp=head;
        ListNode *curr=head;
        while(temp!=nullptr && temp->next!=nullptr){
            temp=temp->next->next;
            curr=curr->next;
            if(temp==curr){
                curr=head;
                while(curr!=temp){
                    curr=curr->next;
                    temp=temp->next;
                }
                return curr;
            }
        }
        return NULL;
    }
};