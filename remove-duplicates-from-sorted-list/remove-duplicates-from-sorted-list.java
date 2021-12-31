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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null ){
            return head ;
        }
        ListNode node = head ;
        ListNode check = head  ;
        
        while ( check.next != null){
                
                if( check.next.val == node.val ) {
                    check.next = check.next.next ;
                }  
            else {
                check =check.next ;
                node = check ;
            }
        }
        return head ;
    }
}