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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        //check the previous node and next node //if previous node< curr and curr> next node rteurn the curr ( nodes index)
        //curr<previous node && curr<next node return ( nodes index)
        // if length of linked list is no local maxima or minima exist return -1 -1 
        int[] ans={-1,-1};
        int first=-1;
        int last=-1;
        ListNode prev= head;
        ListNode curr= head.next;
        int min=Integer.MAX_VALUE;
        int index=1;
        while(curr.next!=null){
            if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val)){
               if(first==-1) first=index;
               else min=Math.min(min,index-last);
                last=index;
            }
            prev=curr;
            curr=curr.next;
            index++;
        }
        if(first!=last){
            ans[0]=min;
            ans[1]=last-first;
        }
        return ans;
    }
}