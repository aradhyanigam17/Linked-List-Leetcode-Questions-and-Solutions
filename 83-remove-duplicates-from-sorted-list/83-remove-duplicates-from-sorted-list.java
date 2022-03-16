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
        ArrayList<Integer> list = new ArrayList<>() ;
        
        ListNode temp = head ;
        
        while(temp != null){
            if(!list.contains(temp.val)){ list.add(temp.val) ;
            }
        temp = temp.next ;
        }
        
        ListNode newHead = new ListNode() ;
        temp = newHead ;
        for(int i = 0 ; i < list.size() ;i++){
            ListNode cur = new ListNode(list.get(i)) ;
            temp.next = cur ;
            temp = temp.next;
        }
        return newHead.next ;
    }
}