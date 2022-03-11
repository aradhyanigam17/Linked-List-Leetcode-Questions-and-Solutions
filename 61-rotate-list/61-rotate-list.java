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
        
        if(head == null || head.next == null) return head ;
        ArrayList<Integer> list = new ArrayList<>() ;
        
        ListNode dup = head ;
        
        while(dup != null){
            list.add(dup.val);
            dup = dup.next;
        }
        
        k = k % list.size() ;        
        for(int i = 0 ; i < k ; i++){
            list.add(0,list.remove(list.size() - 1)) ;
        }
        
        System.out.println(list) ;
        
        ListNode dupHead = new ListNode() ;
        ListNode temp = dupHead ;
        
        for(int i = 0 ; i < list.size() ;i++){
            ListNode node = new ListNode(list.get(i));
            temp.next = node ;
            temp = temp.next ;
        }
        dupHead = dupHead.next ;
        return dupHead ;
        
    }
}