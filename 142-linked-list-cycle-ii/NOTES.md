```
if(head == null || head.next ==null) return null ;
ListNode slow = head ;
ListNode fast = head ;
while(slow != fast ){
slow = slow.next ;
fast = fast.next.next ;
if(slow == null || fast == null) return null ;
}
fast = head ;
while(fast != slow){
fast = fast.next ;
slow = slow.next ;
}
return slow ;
```