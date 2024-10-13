//class Node{
//    int data;
//    Node next ;
//    Node(int d){
//        data = d;
//    }
//}
//
//public class findNthNodeFromEnd {
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
//    static void printNth(Node head, int n) {
//        int len = 0;
//        for (Node curr = head; curr != null; curr = curr.next) {
//            len++;
//        }
//        if (len < n) {
//            return;
//        }
//        Node curr = head;
//        for (int i = 1; i < len - n +1 ; i++) {
//            curr = curr.next;
//        }
//        System.out.println(curr.data);
//    }
//
//    static void printNth2(Node head, int n){
//        if(head == null){
//            return ;
//        }
//        Node slow = head;
//        Node fast = head;
//       for(int i = 1; i <= n; i++){
//           if(head == null){
//               return;
//           }
//           fast = fast.next;
//       }
//       while(fast!= null){
//           slow = slow.next;
//           fast = fast.next;
//       }
//        System.out.println(slow.data);
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
//        printll(head);
//        printNth2(head, 2);
//
//    }
//}
