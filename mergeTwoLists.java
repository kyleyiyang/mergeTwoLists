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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null) return null;
        ListNode ans=new ListNode();
        Stack<ListNode> q = new Stack<>();
        while (l1!=null || l2!=null) {
            
                if (l2==null || l1.val<=l2.val)  q.push(l1);l1=l1.next;
                if (l1==null || l1.val>l2.val) q.push(l2);l2=l2.next;
            /*if (l1!=null && l2!=null) {
                if (l1.val<=l2.val) {
                    q.push(l1);
                    l1=l1.next;
                } else {
                    q.push(l2);
                    l2=l2.next;
                }
            } else if (l1!=null && l2==null) {
                q.push(l1);
                l1=l1.next;
            } else if (l1==null && l2!=null) {
                q.push(l2);
                l2=l2.next;
            }*/
        }
        System.out.println(q);
        while (!q.empty()) {
            ListNode temp = q.pop();
            ans=new ListNode(temp.val,ans);
        }
        return ans;
    }
}
