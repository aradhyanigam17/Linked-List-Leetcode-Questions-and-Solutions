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
        HashSet<ListNode> set = new HashSet<>() ;
        
        ListNode dupHead = head ;
        
        while(dupHead != null){
            if(set.contains(dupHead)) return dupHead ;
            set.add(dupHead) ;
            dupHead = dupHead.next;
        }
        
        return null;
    }
}