//class Node{
//    int data;
//    Node next ;
//    Node(int d){
//        data = d;
//    }
//}
//
//public class segragateEvenNOdd {
//
//    public static Node segregatefun(Node head) {
//        Node es = null, ee = null, os = null, oe = null;
//        for (Node curr = head; curr != null; curr = curr.next) {
//            int x = curr.data;
//            if (x % 2 == 0) {
//                if (es == null) {
//                    es = ee = curr;
//                } else {
//                    ee.next = curr;
//                    ee = ee.next;
//                }
//            } else {
//                if (os == null) {
//                    os = oe = curr;
//                } else {
//                    oe.next = curr;
//                    oe = oe.next;
//                }
//            }
//        }
//        if (os == null || es == null) {
//            return head;
//        }
//        ee.next = os;
//        oe.next = null;
//        return es;
//    }
//
//
//    public static void printll(Node head) {
//        if (head == null) {
//            return;
//        }
//        System.out.print(head.data + " ");
//        for (Node r = head.next; r != null; r = r.next) {
//            System.out.print(r.data + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(1);
//        Node temp1 = new Node(2);
//        Node temp2 = new Node(4);
//        Node temp3 = new Node(3);
//        head.next = temp1;
//        temp1.next = temp2;
//        temp2.next = temp3;
//        temp3.next = null;
//        head = segregatefun(head);
//        printll(head);
//
//    }
//}
