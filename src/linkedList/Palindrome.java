
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
    public class Palindrome {
        public static boolean isPalindrome(ListNode head) {
            ListNode curr = head;
            int res = 0;
            while(curr != null){
                int temp = curr.val;
                res = 10 * res + temp;
                curr = curr.next;
            }
            int x = res;
            int res1 = 0;
            while(x > 0){
                int temp = x % 10;
                res1 = 10 * res1 + temp;
                x = x /10;
            }
            if(res1 == res){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            ListNode temp1 = new ListNode(2);
            ListNode temp2 = new ListNode(2);
            ListNode temp3 = new ListNode(1);
            head.next = temp1;
            temp1.next = temp2;
            temp2.next = temp3;
            boolean temp = isPalindrome(head);
            System.out.println(temp);
        }
    }

