//class Node {
//    int data;
//    Node next;
//
//    Node(int d){
//        data = d;
//    }
//}
//
//public class pairwiseSwap {
//
//    public static Node pairwiseSwapNaive(Node head) {
//        Node curr = head;
//        while (curr != null && curr.next != null) {
//            int temp = curr.data;
//            curr.data = curr.next.data;
//            curr.next.data = temp;
//            curr = curr.next.next;
//        }
//        return head;
//    }
//
//    public static Node pairwiseSwapoptimal(Node head){
//        if(head == null || head.next == null){
//            return head;
//        }
//        Node curr = head.next.next;
//        Node prev = head;
//        head = head.next;
//        head.next = prev;
//        while(curr != null && curr.next != null){
//            prev.next = curr.next;
//            prev = curr;
//            Node coming = curr.next.next;
//            curr.next.next = curr;
//            curr = coming;
//        }
//        prev.next = curr;
//        return head;
//    }
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
//        head = pairwiseSwapoptimal(head);
//        printll(head);
//    }
//}
