//
// class ListNode {
//     int val;
//     ListNode next;
//
//     ListNode() {
//     }
//
//     ListNode(int val) {
//         this.val = val;
//     }
//
//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
//
// }
//    public class Palindrome {
//        public static boolean isPalindrome(listNode head) {
//            listNode curr = head;
//            int res = 0;
//            while(curr != null){
//                int temp = curr.val;
//                res = 10 * res + temp;
//                curr = curr.next;
//            }
//            int x = res;
//            int res1 = 0;
//            while(x > 0){
//                int temp = x % 10;
//                res1 = 10 * res1 + temp;
//                x = x /10;
//            }
//            if(res1 == res){
//                return true;
//            }
//            return false;
//        }
//
//        public static void main(String[] args) {
//            listNode head = new listNode(1);
//            listNode temp1 = new listNode(2);
//            listNode temp2 = new listNode(2);
//            listNode temp3 = new listNode(1);
//            head.next = temp1;
//            temp1.next = temp2;
//            temp2.next = temp3;
//            boolean temp = isPalindrome(head);
//            System.out.println(temp);
//        }
//    }
//
