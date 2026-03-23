
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode temp=new ListNode(0);
       temp.next=head;

       ListNode prevleft=temp;
       ListNode current=head;
       for(int i=1;i<left;i++){
            current=current.next;
            prevleft=prevleft.next;
       }
        ListNode subhead=current;

        ListNode prev =null;
        for(int i=right-left+1;i>0;i--){
            ListNode nextnode=current.next;
            current.next=prev;
            prev=current;
            current=nextnode;
        }
        prevleft.next=prev;
        subhead.next=current;

        return temp.next;
    }
}