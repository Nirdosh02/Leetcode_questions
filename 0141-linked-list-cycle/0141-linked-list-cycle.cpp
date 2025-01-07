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
    
    bool hasCycle(ListNode *head) {
        ListNode *temp=head;
        ListNode *curr=head;
        
        while(temp!=nullptr && temp->next!=nullptr){
            temp=temp->next->next;
            curr=curr->next;
            if(temp==curr){
                return true;
            }
            
        }
        return false;
    }
};