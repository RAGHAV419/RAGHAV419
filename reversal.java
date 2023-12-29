class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode previous=null;
        while(current!=null){
           ListNode ahead=current.next;
           current.next=previous;
           previous=current;
           current=ahead;
           
        }
        return previous;
    }
}