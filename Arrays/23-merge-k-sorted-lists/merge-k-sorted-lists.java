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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> nodevalues=new ArrayList<>();

        for(ListNode list: lists){
            while(list!=null){
                nodevalues.add(list.val);
                list=list.next;
            }
        }
        
        Collections.sort(nodevalues);

        ListNode head = new ListNode(0);

        ListNode curr = head ;

        for(int val : nodevalues){
            curr.next=new ListNode(val);
            curr=curr.next;
        }
        
        return head.next;


    }
}