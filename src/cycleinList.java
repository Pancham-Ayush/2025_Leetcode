public class cycleinList {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head; // Tortoise (slow pointer)
        ListNode fast = head; // Hare (fast pointer)
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle, fast pointer reached the end of the list
    }
}
