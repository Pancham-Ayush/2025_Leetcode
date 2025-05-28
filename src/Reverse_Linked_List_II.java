public class Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = new ListNode(0, head), prev = null, p = null, next = null, ct = null;

        ListNode y = temp;
        int i = 1;
        for (; i < left; i++) {
            temp = temp.next;
        }
        ListNode cur = temp;

        ListNode rh = temp.next;
        int x = 0;
        while (x <= right - left) {
            if (ct == null) {
                ct = rh;
            }
            next = rh.next;
            rh.next = p;
            p = rh;
            rh = next;
            x++;

        }
        cur.next = p;
        ct.next = rh;
        return y.next;
    }
}