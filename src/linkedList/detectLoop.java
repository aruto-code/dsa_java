//import java.util.HashSet;
//
//class Node{
//    int val;
//    Node next;
//    Node(int d){
//        val = d;
//    }
//}
//
//
//public class detectLoop{
//
//    public static void printll(Node head) {
//                if (head == null) {
//                        return;
//                }
//                System.out.print(head.val + " ");
//                for (Node r = head.next; r != head; r = r.next) {
//                        System.out.print(r.val + " ");
//                }
//        }
//    static boolean isLoop(Node head){
//        int x = 0;
//        Node temp = new Node(x);
//        Node curr = head;
//        while(curr!= null){
//            if(curr.next == null){
//                return false;
//            }
//            if(curr.next == temp){
//                return true;
//            }
//            Node curr_next = curr.next;
//            curr.next = temp;
//            curr = curr_next;
//        }
//        return false;
//    }
//    static boolean isLoopUsingHashing(Node head){
//        HashSet<Node> h = new HashSet<>();
//        Node curr;
//        for(curr = head; curr != null; curr =  curr.next){
//           if(h.contains(curr)) {
//               return true;
//           }
//           h.add(curr);
//        }
//        return false;
//    }
//    static boolean isLoopFloydDetection(Node head){
//        Node slow_p = head, fast_p = head;
//        while(fast_p != null && fast_p.next != null){
//            slow_p = slow_p.next;
//            fast_p = fast_p.next.next;
//            if(slow_p == fast_p){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//                Node head = new Node(1);
//                Node temp1 = new Node(2);
//                Node temp2 = new Node(2);
//                Node temp3 = new Node(1);
//                head.next = temp1;
//                temp1.next = temp2;
//                temp2.next = temp3;
//                temp3.next = head;
//                boolean temp_aux = isLoopUsingHashing(head);
//                // run each function one at a time as curr will set to null that will create a problem
//              //  boolean temp = isLoop(head);
//
////                if(temp == true){
////                    System.out.println(true);
////                }
////                else{
////                    System.out.println(false);
////                }
//                if(temp_aux == true){
//                    System.out.println(true);
//                }
//                else{
//                    System.out.println(false);
//                }
//    }
//
//}
