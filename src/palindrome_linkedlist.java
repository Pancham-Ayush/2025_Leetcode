public class palindrome_linkedlist {
    public boolean isPalindrome(ListNode head) {
    StringBuilder x=new StringBuilder();
    while (head!=null){
         x.append(head.val);
         head=head.next;
     }
    boolean check = true;
    for (int i=0, j = x.length()-1;i<x.length() && j>=0 ;i++ , j--){
        if(x.charAt(i)!=x.charAt(j)) {
            check = false;
            break;
        }
    }

        return check;
    }
}
