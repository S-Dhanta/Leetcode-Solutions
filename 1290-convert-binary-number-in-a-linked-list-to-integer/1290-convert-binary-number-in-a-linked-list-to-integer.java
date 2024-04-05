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
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        int ans=0,count=0;
        while(head != null){
            list.add(head.val);
            head=head.next;
        }
        for(int i=list.size()-1;i>=0;i--){
            ans+=(list.get(i))*(Math.pow(2,count));
            count+=1;
        }
        
        return ans;
    }
}