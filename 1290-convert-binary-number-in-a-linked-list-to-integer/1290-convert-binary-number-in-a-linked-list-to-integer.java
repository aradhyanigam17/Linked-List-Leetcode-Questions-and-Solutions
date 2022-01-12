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
     public int getDecimalValue(ListNode head){
        if((head == null)) return -1 ;// there no value

        ListNode temp = head ;

        int count = 0 ;

        while(temp.next != null){
            temp = temp.next ;
            count++ ;
        }

        ListNode temp2 = head ;
        int sum = 0 ;
        while(temp2 != null){
            sum += temp2.val * (int)Math.pow(2,count); 
        count-- ;
            temp2 = temp2.next ;
        }
        return sum ;
    }
}