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
    public Node copyRandomList(Node head) {
        Node curr = head ;

        if(head==null) return null;
        // creating new node with existing nodes

        while(curr!= null){
            Node new_node = new Node(curr.val);
            new_node.next=curr.next;
            curr.next=new_node;
            curr=new_node.next;
        }


        // creating random values for the new node 

        curr =head;
        while(curr!=null){

           if(curr.random!=null){
                curr.next.random=curr.random.next;
            } 
            curr=curr.next.next;
        }


        // seperate two lists


        curr=head;
        Node new_head=head.next;
        Node new_curr=head.next;

        while(curr!=null){

            curr.next=new_curr.next;
            curr=curr.next;
            if(curr!=null){
                new_curr.next=curr.next;
                new_curr=new_curr.next;

            } 
        }

        return new_head ;     
        
    }
}