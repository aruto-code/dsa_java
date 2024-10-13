//class Node{
//    int data;
//    Node next ;
//    Node(int d){
//        data = d;
//    }
//}
//
//
//public class detectAndRemoveLoop {
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
//    public  static Node detectCycle(Node head) {
//        if(head == null){
//            return null;
//        }
//        if(head.next == null){
//            return null;
//        }
//        if(head.next == head){
//            return head;
//        }
//        Node slow_p = head, fast_p = head;
//        while(fast_p != null && fast_p.next != null){
//            slow_p = slow_p.next;
//            fast_p = fast_p.next.next;
//            if(slow_p == fast_p){
//                break;
//            }
//        }
//        if(slow_p != fast_p){
//            return null;
//        }
//        slow_p = head;
//        while(slow_p != fast_p){
//            slow_p = slow_p.next;
//            fast_p = fast_p.next;
//        }
//        fast_p.next = null;
//        return slow_p;
//    }
//    public static void main(String[] args) {
//        Node head = new Node(1);
////        Node temp1 = new Node(2);
////        Node temp2 = new Node(4);
////        Node temp3 = new Node(3);
////        head.next = temp1;
////        temp1.next = temp2;
////        temp2.next = temp3;
////        temp3.next = null;
//        Node temp = new Node(0);
//        printll(head);
//        temp = detectCycle(head);
//        System.out.println(temp);
//
//    }
//}
