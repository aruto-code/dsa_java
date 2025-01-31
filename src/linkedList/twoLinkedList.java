//class Node {
//        int val;
//        Node next;
//
//        Node(int d){
//        val = d;
//        }
//}
//
//public class twoLinkedList {
//
//        Node SortedMerge(Node a, Node b){
//        if(a == null){
//                return b;
//        }
//        if(b == null){
//                return a;
//        }
//        Node head = null, tail = null;
//        if(a.val <= b.val){
//                head = tail = a;
//                a = a.next;
//        }
//        else{
//                head = tail = b;
//                b = b.next;
//        }
//        while(a!= null && b!= null){
//                if(a.val <= b.val){
//                        tail.next = a;
//                        tail = a;
//                        a = a.next;
//                }
//                else{
//                        tail.next = b;
//                        tail = a;
//                        b = b.next;
//                }
//        }
//        if(a == null){
//            tail.next = b;
//        }
//        else{
//                tail.next = a;
//        }
//        return head;
//        }
//        public static void main(String[] args) {
//                Node head = new Node(1);
//                Node temp1 = new Node(2);
//                Node temp2 = new Node(4);
//                Node temp3 = new Node(3);
//                head.next = temp1;
//                temp1.next = temp2;
//                temp2.next = temp3;
//                temp3.next = null;
//        }
//
//}
