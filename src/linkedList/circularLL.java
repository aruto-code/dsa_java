//
//class Node {
//        int val;
//        Node next;
//
//        Node(int d){
//        val = d;
//        }
//}
//
//
//public class circularLL {
//        public static void printll(Node head) {
//                if (head == null) {
//                        return;
//                }
//                System.out.print(head.val + " ");
//                for (Node r = head.next; r != head; r = r.next) {
//                        System.out.print(r.val + " ");
//                }
//        }
//
//        public static Node insertAtThebeg(Node head, int x) {
//                Node temp = new Node(x);
//                if (head == null) {
//                        temp.next = temp;
//                } else {
//                        Node curr = head;
//                        while (curr.next != head) {
//                                curr = curr.next;
//                        }
//                        curr.next = temp;
//                        temp.next = head;
//                }
//                return temp;
//        }
//        public static Node insertAttheEnd(Node head, int x){
//                Node temp = new Node(x);
//                if(head == null){
//                        temp.next = temp;
//                }
//                else{
//                        Node curr = head;
//                        temp.next = head.next;
//                        head.next = temp;
//                        int t = head.val;
//                        head.val = temp.val;
//                        temp.val = t;
//
//                }
//                 return temp;
//                }
//         public static Node deleteAtThelastNode(Node head){
//                if(head == null || head.next == null){
//                        return null;
//                }
//                Node curr = head ;
//                while(curr.next.next != null){
//                        curr = curr.next;
//                }
//                curr.next = head.next;
//                return curr.next;
//         }
//
//        public static void main(String[] args) {
//                Node head = new Node(1);
//                Node temp1 = new Node(2);
//                Node temp2 = new Node(2);
//                Node temp3 = new Node(1);
//                head.next = temp1;
//                temp1.next = temp2;
//                temp2.next = temp3;
//                temp3.next = head;
//                head = insertAtThebeg(head, 4);
//                head = insertAttheEnd(head, 8);
//                head = deleteAtThelastNode(head);
//                printll(head);
//        }
//}
