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
    public boolean hasCycle(ListNode head) {
        
        if(head == null) return false ;
        
        HashSet<ListNode> set = new HashSet<>() ;
        
        ListNode dupHead = head ;
        
        while(dupHead != null){
            if(set.contains(dupHead)){
                 return true;
            }
            else{
                set.add(dupHead);
                dupHead = dupHead.next ;
            }
        }
       
        return false;
        
        
    }
}