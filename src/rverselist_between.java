public class rverselist_between {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if (head == null || left == right) return head; // Edge case: No need to reverse

            ListNode dummy = new ListNode(-1); // Dummy node for easy handling of edge cases
            dummy.next = head;
            ListNode prev = dummy;

            // Move `prev` to the node before the `left` position
            for (int i = 1; i < left; i++) {
                prev = prev.next;
            }

            // Start reversing the sublist
            ListNode current = prev.next;
            ListNode nextNode;
            ListNode tail = current; // This will become the tail of the reversed sublist

            for (int i = 0; i < right - left + 1; i++) {
                nextNode = current.next;
                current.next = prev.next;
                prev.next = current;
                current = nextNode;
            }

            // Reconnect the reversed sublist with the rest of the list
            tail.next = current;

            return dummy.next;
        }
    }
