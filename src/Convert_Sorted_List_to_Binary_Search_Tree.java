public class Convert_Sorted_List_to_Binary_Search_Tree {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode fast=head,slow=head, prev= null;
        if (head == null) return null;

        if (head.next == null) {
            return new TreeNode(head.val);
        }
        while(fast!=null&& fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        TreeNode th = new TreeNode(slow.val);
        th.left =sortedListToBST(head);
        th.right=sortedListToBST(slow.next);
        return th;
    }

}
