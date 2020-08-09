//leetcode 2 Add Two Numbers
//solution

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode placeHolder=dummyHead;
        int carry=0;
        while(l1!=null||l2!=null){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            placeHolder.next=new ListNode(sum%10);
            carry=sum/10;
            placeHolder=placeHolder.next;
        }
        if(carry>0){
            placeHolder.next=new ListNode(carry);
        }
        return dummyHead.next;
    }
}