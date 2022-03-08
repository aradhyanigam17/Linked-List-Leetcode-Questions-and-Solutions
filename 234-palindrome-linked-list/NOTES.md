```
class Solution {
public boolean isPalindrome(ListNode head) {
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
}
}
```