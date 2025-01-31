//import java.util.Stack;
//
//class Node{
//    int key ;
//    Node left;
//    Node right;
//    Node(int k){
//        key = k;
//    }
//}
//
//public class IterativeInorder {
//    static void iterativeInorder(Node root){
//        Stack<Node> st = new Stack<>();
//        Node curr = root;
//        while(curr != null || st.isEmpty() == false){
//            while(curr != null){
//                st.push(curr);
//                curr= curr.left;
//            }
//            curr = st.pop();
//            System.out.println(curr.key + " ");
//            curr = curr.right;
//        }
//    }
//    public static void main(String args[]) {
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        iterativeInorder(root);
//    }
//}
