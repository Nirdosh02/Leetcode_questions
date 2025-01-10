/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public void copy(Node head){
        Node temp=head;
        while(temp!=null){
            Node next = temp.next;
            Node copynode = new Node(temp.val);
            copynode.next=next;
            temp.next=copynode;
            temp=temp.next.next;
        }
       
    }

    public void connect(Node head){
        Node temp = head;
        while(temp!=null){
            Node copynode = temp.next;
            if(temp.random!=null){
            copynode.random = temp.random.next;}
            else{
            copynode.random = null;}
            temp=temp.next.next;
        }
        
    }

    public Node getn(Node head){
        Node temp=head;
        Node dummy = new Node(-1);
        Node res = dummy;
        while(temp!=null){
            res.next = temp.next;
            res=res.next;

            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummy.next;
    }

    public Node copyRandomList(Node head) {
        copy(head);
        connect(head);
        return getn(head);
    }
}