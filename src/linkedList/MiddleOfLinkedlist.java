//class Node{
//    int data;
//    Node next ;
//    Node(int d){
//        data = d;
//    }
//}
//
//public class MiddleOfLinkedlist {
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
//    public static void MiddleOfLL(Node head)
//    {
//        if(head == null){
//            return;
//        }
//        int count = 0;
//        Node curr;
//        for(curr = head; curr!= null ; curr= curr.next){
//            count++;
//        }
//        curr = head;
//        for(int i  = 0; i < count/2; i++){
//            curr = curr.next;
//        }
//        System.out.println(curr.data);
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
//        MiddleOfLL(head);
//        printll(head);
//
//    }
//}
