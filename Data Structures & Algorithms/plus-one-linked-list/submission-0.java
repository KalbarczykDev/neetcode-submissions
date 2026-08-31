class Solution {
    public ListNode plusOne(ListNode head) {
        int carry = 1;
        ListNode current = head;
        List<ListNode> nodes = new ArrayList<>();

        while (current != null) {
            nodes.add(current);
            current = current.next;
        }

        for(int i = nodes.size() - 1; i >= 0; i--) {
            int sum = nodes.get(i).val + carry;

            if(sum > 9) {
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            nodes.get(i).val = sum;

            if(carry == 0) return head;
        }

        if(carry != 0) {
            ListNode newHead = new ListNode(carry);
            newHead.next = head;
            head = newHead;
        }

        return head;
    }
}