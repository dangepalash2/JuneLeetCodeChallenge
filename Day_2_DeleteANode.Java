/**
 * Problem 237 - Linked List
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //This question test your pretty basic knowledge, as this is pretty easy thing to do in linked list.
class Solution {
    public void deleteNode(ListNode node) {
       //Making the current node as the next node
       node.val = node.next.val;
       //Pointing the current node pointer to the node next to it.
       node.next = node.next.next;
    }
}