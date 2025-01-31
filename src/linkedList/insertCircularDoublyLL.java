//class Node {
//        int val;
//        Node next;
//        Node prev;
//        Node(int d){
//        val = d;
//        }
//}
//
//
//public class insertCircularDoublyLL {
//
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
//        public static Node insertCircularDDl(Node head, int x){
//                Node temp = new Node(x);
//                if(head == null){
//                        temp.next = temp;
//                        temp.prev = temp;
//                        return temp;
//                }
//                temp.prev = head.prev;
//                temp.next = head;
//                head.prev.next = temp;
//                head.prev = temp;
//                return temp;
//        }
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
//                temp3.prev = temp2;
//                temp2.prev = temp1;
//                temp1.prev = head;
//                head.prev = temp3;
//                printll(head);
//                head = insertCircularDDl(head, 23);
//                System.out.println();
//                printll(head);
//
//
//        }
//}
