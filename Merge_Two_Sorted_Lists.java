/**
 * https://leetcode.com/problems/merge-two-sorted-lists
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
           if(l1 == null)
              return l2;
           if(l2 == null)
              return l1;
           if(l1.val > l2.val) {
              ListNode t = l1;
              l1 = l2;
              l2 = t;
           }
           l1.next = mergeTwoLists(l2,l1.next);
           return l1;
    }
}
