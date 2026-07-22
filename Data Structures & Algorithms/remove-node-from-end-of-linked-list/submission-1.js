/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @param {number} n
     * @return {ListNode}
     */
    removeNthFromEnd(head, n) {
        let dummy = new ListNode(0);
        dummy.next = head;
        let stack = [dummy];
        let cur = head;
        while (cur) {
            stack.push(cur);
            cur = cur.next;
        }

        let prev;
        for (let i = 0; i <= n; i++) {
            prev = stack.pop();
        }

        prev.next = prev.next.next;

        return dummy.next;
    }
}
