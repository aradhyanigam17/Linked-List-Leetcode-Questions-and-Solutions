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
    public boolean isPalindrome(ListNode head) {
      ArrayList<Integer> list = new ArrayList<>();
        
        ListNode dupHead = head ;
        
        while(dupHead != null){
            list.add(dupHead.val);
            dupHead = dupHead.next ;
        }
        
        int i = 0 , j = list.size() - 1 ;
        
        while(i < j ){
            
            if(list.get(i) != list.get(j)) return false ;
            i++ ;
            j-- ;
            
            
        }
        return true; 
  
        
    }
}
      
/*
  if(head == null) return false ;
        
        
        ListNode prev = null;
        ListNode dupHead = head ;
        ListNode next = head.next ;
        
        while(dupHead != null){
            dupHead.next = prev ;
            prev = dupHead ;
            dupHead = next;
            if(next != null) next = next.next ;
        }
        
        
        while(prev != null && head != null){
            if(prev.val != head.val) return false ;
            
            prev = prev.next ;
            head = head.next ;
        }
     
        return true ;
*/