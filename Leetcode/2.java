
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode ans = res;
        int k = 0;
        while (l1 != null || l2 != null) {
            res.next = new ListNode();
            res = res.next;
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int v = a + b;
            res.val = (v + k) % 10;
            k = (v + k) / 10;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (k > 0) {
            res.next = new ListNode(k);
        }
        return ans.next;
    }
}