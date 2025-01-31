//class node {
//        int val;
//        node next;
//
//        node(int d){
//        val = d;
//        }
//}
//
//public class intersectionPointsLL {
//    public static node getIntersectionNode(node headA, node headB) {
//        node curr1 = headA;
//        node curr2 = headB;
//        int c1 = 0, c2 = 1, c =0;
//        while(curr1 != null){
//            c1++;
//            curr1 = curr1.next;
//        }
//        while(curr2 != null){
//            c2++;
//            curr2 = curr2.next;
//        }
//        c = Math.abs(c1 - c2);
//        if(c1 > c2){
//            curr1 = headA;
//           for(int i = 0; i < c; i++){
//              curr1 = curr1.next;
//           }
//        }
//        else{
//            curr2 = headA;
//            for(int i = 0; i < c; i++){
//                curr2 = curr2.next;
//            }
//        }
//
//
//        while (curr1 != null && curr2 != null) {
//            if (curr1 == curr2) {
//                return curr1;
//            }
//            curr1 = curr1.next;
//            curr2 = curr2.next;
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        node headA = new node(1);
//        node temp1 = new node(2);
//        node temp2 = new node(4);
//        node temp3 = new node(3);
//        headA.next = temp1;
//        temp1.next = temp2;
//        temp2.next = temp3;
//        temp3.next = null;
//        node headB = new node(8);
//        headB.next = temp1;
//
//        node head = getIntersectionNode( headA, headB);
//        System.out.println(head);
//        System.out.println(temp1);
//
//    }
//}
