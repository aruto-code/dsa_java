//
//class Node{
//    int data;
//    Node prev;
//    Node next;
//    Node(int d){
//        int data = d;
//        next = prev = null;
//    }
//}
//public class reverseDoublylinkedList {
//
//    Node reverseDDL(Node head){
//        if(head == null || head.next == null){
//            return head;
//        }
//        Node prev = null;
//        Node curr = head;
//        while(curr != null){
//            prev = curr.prev;
//            curr.prev = curr.next;
//            curr.next = prev;
//            curr = curr.prev;
//        }
//        return prev.prev;
//    }
//
//        public static void main(String args[])
//        {
//            Node head = new Node(10);
//            Node temp1 = new Node(20);
//            Node temp2 = new Node(30);
//            head.next = temp1;
//            temp1.next = temp2.next;
//            temp1.prev = head;
//            temp2.prev = temp1;
//        }
//
//    }
//
