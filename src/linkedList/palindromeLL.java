class Node {
    int val;
    Node next;

    Node(int d){
        val = d;
    }
}


public class palindromeLL {
    static Node Reverse(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    boolean ispalindrome(Node head){
        if(head == null){
            return true;
        }
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = Reverse(slow.next);
        Node curr = head;

    while(rev != null){
        if(rev.val != curr.val){
            return false;
        }
        rev = rev.next;
        curr = curr.next;
    }
    return true;
    }
    public static void main(String[] args) {
                Node head = new Node(1);
                Node temp1 = new Node(2);
                Node temp2 = new Node(4);
                Node temp3 = new Node(3);
                head.next = temp1;
                temp1.next = temp2;
                temp2.next = temp3;
                temp3.next = null;
         }
}
