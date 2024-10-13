//class Node {
//        int val;
//        Node next;
//
//        Node(int d){
//        val = d;
//        }
//}
//
//    public class deleteKthNodeCircularLL {
//        public static void printll(Node head) {
//            if (head == null) {
//                return;
//            }
//            System.out.print(head.val + " ");
//            for (Node r = head.next; r != head; r = r.next) {
//                System.out.print(r.val + " ");
//            }
//        }
//        public static Node deleteHead(Node head){
//                if(head == null || head.next == null){
//                        return null;
//                }
//                Node curr = head ;
//                while(curr.next != null){
//                        curr = curr.next;
//                }
//                curr.next = head.next;
//                return curr.next;
//         }
//
//    public static Node Deletekth(Node head, int k)
//    {
//        if(head == null) {
//            return head;
//    }
//        if(k == 1){
//            return deleteHead(head);
//        }
//        Node curr = head;
//        for(int i = 0; i < k- 2;i++){
//            curr = curr.next;
//        }
//        curr.next = curr.next.next;
//        return head;
//        }
//
//
//
//    public static void main(String[] args) {
//                Node head = new Node(1);
//                Node temp1 = new Node(2);
//                Node temp2 = new Node(4);
//                Node temp3 = new Node(3);
//                head.next = temp1;
//                temp1.next = temp2;
//                temp2.next = temp3;
//                temp3.next = head;
//                Deletekth(head, 4);
//                printll(head);
//        }
//}
