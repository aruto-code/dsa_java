//class Node{
//    int data;
//    Node next ;
//    Node(int d){
//        data = d;
//    }
//}
//
//public class sortedInsertinLL {
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
//    public static Node sortedInsertFun(Node head, int x){
//        Node temp = new Node(x);
//        if(head == null){
//            return temp;
//        }
//        if(x < head.data){
//            temp.next = head;
//            return temp;
//        }
//        Node curr = head;
//        while(curr.next != null && x > curr.next.data){
//            curr = curr.next;
//        }
//        temp.next = curr.next;
//        curr.next = temp;
//        return head;
//    }
//
//
//    public static void main(String[] args) {
//        Node head = new Node(1);
//        Node temp1 = new Node(2);
//        Node temp2 = new Node(30);
//        Node temp3 = new Node(40);
//        head.next = temp1;
//        temp1.next = temp2;
//        temp2.next = temp3;
//        temp3.next = null;
//        head = sortedInsertFun(head, 25);
//        printll(head);
//
//    }
//}
