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
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> list = new ArrayList<>() ;
        
        ListNode temp = head ;
        while(temp != null){
            if(temp.val == val) temp =  temp.next ;
            else{
                list.add(temp.val);
                temp = temp.next ;
            }
        }
        
        ListNode newHead = new ListNode() ;
        
        temp = newHead; 
        
        for(int i = 0 ; i < list.size() ;i++){
            ListNode node = new ListNode(list.get(i));
            temp.next = node ;
            temp = temp.next ;
        }
        
        return newHead.next ;
    }
}