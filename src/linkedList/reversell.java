//class Node{
//    int data;
//    Node next ;
//    Node(int d){
//        data = d;
//    }
//}
//
//public class reversell {
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
//    static Node RevRec(Node head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        Node rest_head = RevRec(head.next);
//        Node rest_tail = head.next;
//        rest_tail.next = head;
//        head.next = null;
//        return rest_head;
//    }
//
//    static Node Reverse(Node head) {
//        Node curr = head;
//        Node prev = null;
//        while (curr != null) {
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
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
//        //head = Reverse(head);
//        head = RevRec(head);
//        System.out.println();
//        printll(head);
//
//    }
//}
