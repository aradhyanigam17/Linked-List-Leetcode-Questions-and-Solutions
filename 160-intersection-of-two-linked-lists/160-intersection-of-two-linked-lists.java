/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode dupHead1 = headA ;
        
        ListNode dupHead2 = headB ;
        
        while(dupHead1 != null || dupHead2 != null){
            
                if(dupHead1 == null){
                dupHead1 = headB ;
                }
                if(dupHead2 == null){
                    dupHead2 = headA ;
                }
            
            if(dupHead1 == dupHead2) return dupHead1 ;
            dupHead1 = dupHead1.next ;
            dupHead2 = dupHead2.next ;
            
            
        }
        
        
        return null  ;

    }
}

/*
//optimal 1
// Tc - O(N)+o(M)+O(M-N)~+ O(2M)
// Sc -O(1)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        int len1  = 0 ;
        ListNode l1 = headA ;
        
        int len2 = 0 ;
        ListNode l2 = headB ;
        
        while(l1 != null){
            len1++ ;
            l1 = l1.next ;
        }
        
        while(l2 != null){
            len2++ ;
            l2 = l2.next ;
        }
        
        int diff = Math.abs(len1 -len2) ;
        
        if(len1 > len2){
            for(int i  = 0; i <  diff ;i++){
                headA =headA.next ;
            }
        }
        else{
            for(int i =0 ; i < diff ;i++){
                headB= headB.next  ;
            }
        }
        
        while(headA != null && headB != null){
            if(headA == headB){
                return headA ;
            }
            headA = headA.next ;
            headB = headB.next ;
        }
        return null ;
    }
}


*/
/*

// brute force
//tc - O(M+N)
//sc - O(1)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        while(headB != null){
            
            ListNode temp = headA ;
           
            while(temp != null){
                if(temp == headB){
                    return temp ;
                }
                temp = temp.next ;
            }
            
            headB = headB.next ;
        }
        
        return null ;
    }
}

*/