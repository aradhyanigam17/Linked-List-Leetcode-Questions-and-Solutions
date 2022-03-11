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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head ==null || head.next == null) return head; 
        
        if(k == 0 ) return head;
        int len = 0 ;
        
        ListNode temp = head ;
        
        while(temp != null){
            len++ ;
            temp = temp.next ;
        }
        k = k % len ;
        if(k == 0 ) return head;
        ListNode dupHead = head ;
        for(int i = 1 ; i < len - k ;i++){
            dupHead =dupHead.next ;
        }
        
        ListNode dup = dupHead.next ;
        dupHead.next = null ;
        ListNode dummy = dup ;
        
        while(dup.next != null){
            dup =dup.next ;
        }
        
        dup.next = head;
        
        head = dummy ;
        
        
        return head ;
    }
}