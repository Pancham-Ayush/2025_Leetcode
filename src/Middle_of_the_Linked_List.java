public class Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
    ListNode middle=head,fast=head;
    while (fast!=null && fast.next!=null) {
        fast = fast.next.next;
        middle = middle.next;
    }
    return middle;
    }
}
