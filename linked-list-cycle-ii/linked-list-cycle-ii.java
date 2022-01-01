/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode detectCycle(ListNode head) {
                if(head == null ) return null ;
        
         
        ListNode fast = head ;
        ListNode slow = head ;
        
        int length = 0 ;
            
        while(fast != null && fast.next != null ){
            fast = fast.next.next ;
            slow = slow.next ;
            
            if(fast == slow){
              length = lengthCycle(slow) ;
                break ;
            
            }
        }
        
        if(length == 0) return null ;
        
        
        ListNode c1 = head ;
        
        ListNode c2 = head ;
        
        while(length > 0){
            c2= c2.next ;
            length-- ;
            
        }
        
        while(c1 != c2){
            c1 = c1.next ;
            c2 = c2.next ;
        }
    
        return c1 ;
        
        

    }
    
    private int lengthCycle(ListNode head){
        if(head == null ) return 0 ;
        
        
        ListNode fast = head ;
        ListNode slow = head ;
        int length = 0 ;
        while(fast != null && fast.next != null ){
            fast = fast.next.next ;
            slow = slow.next ;
            
            if(fast == slow){
                
                ListNode temp = slow ;
                
                do{
                    temp = temp.next ;
                    length++ ;
                }
                while(temp != slow);
                
                return length ;
            }

        }
        return 0 ;
    }
}