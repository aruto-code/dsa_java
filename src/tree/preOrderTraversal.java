//import java.util.Stack;
//
//class Node{
//    int key ;
//    Node left;
//    Node right;
//    Node(int k){
//    key = k;
//    }
//}
//
//
//public class preOrderTraversal {
//    static void preorder(Node root){
//        if(root == null){
//            return;
//        }
//          Stack<Node> st = new Stack<>();
//          st.push(root);
//          while(st.isEmpty() == false) {
//              Node curr = st.pop();
//              System.out.print(curr.key + " ");
//              if (curr.right != null) {
//                  st.push(curr.right);
//              }
//              if (curr.left != null) {
//                  st.push(curr.left);
//              }
//          }
//    }
//    public static void main(String args[]) {
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        preorder(root);
//    }
//}
