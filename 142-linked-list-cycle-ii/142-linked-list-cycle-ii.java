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
        if(head == null) return head ;
        
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode dupHead = head ;
        
        while(dupHead != null){
            if(list.contains(dupHead)) return dupHead ;
            else{
                list.add(dupHead);
                dupHead = dupHead.next ;
            }    
        }
        return null;
    }
}