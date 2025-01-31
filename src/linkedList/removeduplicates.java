
//class Node{
//    int data;
//    Node next ;
//    Node(int d){
//        data = d;
//    }
//}
//
//public class removeduplicates {
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
//    public static Node removeDups(Node head) {
//        Node curr = head;
//        while (curr != null && curr.next != null) {
//            if (curr.data == curr.next.data) {
//                curr.next = curr.next.next;
//            } else {
//                curr = curr.next;
//            }
//        }
//        return head;
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(1);
//        Node temp1 = new Node(2);
//        Node temp2 = new Node(2);
//        Node temp3 = new Node(3);
//        head.next = temp1;
//        temp1.next = temp2;
//        temp2.next = temp3;
//        temp3.next = null;
//        printll(head);
//        head = removeDups(head);
//        System.out.println();
//        printll(head);
//
//    }
//}
