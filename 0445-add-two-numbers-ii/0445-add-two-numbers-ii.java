
class Solution {
    static ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp =new ListNode(0) ,res=temp;
        int carry=0;
        l1=reverseList(l1);
        l2=reverseList(l2);

        while(l1!=null || l2!=null || carry > 0){
            if(l1 !=null){
                carry += l1.val;
                l1=l1.next;
            }
            if(l2 !=null){
                carry += l2.val;
                l2=l2.next;
            }
            temp.next =new ListNode(carry%10);
            temp=temp.next;
            carry/=10;
        }
        return reverseList(res.next);
    }
}