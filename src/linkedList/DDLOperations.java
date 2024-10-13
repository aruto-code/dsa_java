//
//class listNode {
//    int val;
//    listNode next;
//    listNode prev;
//
//    listNode(int d){
//        val = d;
//    }
//}
//
//
//public class DDLOperations {
//
//    public static void printll(listNode head){
//        if(head == null){
//            System.out.println("empty");
//            return;
//        }
//        listNode curr = head;
//        while(curr!= null){
//            System.out.print(curr.val + "->");
//            curr = curr.next;
//        }
//    }
//    public static listNode insertAtThebeg(listNode head, int x) {
//        listNode temp = new listNode(x);
//        temp.next = head;
//        if (head != null) {
//            head.prev = temp;
//        }
//        return temp;
//    }
//
//    public static listNode insertAtTheEnd(listNode head, int x){
//        listNode temp = new listNode(x);
//        if(head == null){
//            return temp;
//        }
//        listNode curr = head;
//        while(curr.next != null){
//            curr = curr.next;
//        }
//        curr.next = temp;
//        temp.prev = curr;
//        return head;
//    }
//
//    public static listNode deleteTheEndNode(listNode head){
//        if(head == null || head.next == null){
//            return null;
//        }
//        listNode curr = head;
//        while(curr.next != null){
//            curr = curr.next;
//        }
//        curr.prev.next = null;
//        return head;
//    }
//
//    public static void main(String[] args) {
//        listNode head = new listNode(1);
//        listNode temp1 = new listNode(2);
//        listNode temp2 = new listNode(2);
//        listNode temp3 = new listNode(1);
//        head.next = temp1;
//        temp1.next = temp2;
//        temp2.next = temp3;
//        temp3.prev = temp2;
//        temp2.prev = temp1;
//        temp1.prev = head;
//        head = insertAtThebeg(head, 4);
//        head = insertAtTheEnd(head, 9);
//        head = deleteTheEndNode(head);
//        printll(head);
//    }
//}
