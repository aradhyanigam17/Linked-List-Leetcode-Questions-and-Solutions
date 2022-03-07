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
    public ListNode middleNode(ListNode head) {
        if(head == null) return head ;
        
        ListNode slow = head ;
        ListNode fast = head ;
        
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        
        return slow ;
    }
    
    /* //brute force
    class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) return head ;
       
        int length = 0;  
        ListNode node = head ;
        
        while(node != null){
            node = node.next ;
            length++ ;
        }
        System.out.println(length);
        
        int mid = length / 2 ;
        
        for(int i = 0 ; i < mid ; i++){
            head = head.next ;
        }
        return head ;
    }
 }
    */
}
