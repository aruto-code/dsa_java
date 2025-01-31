//class Node{
//    int key ;
//    Node left;
//    Node right;
//    Node(int k){
//        key = k;
//    }
//}
//
//
//
//public class BalancedTree {
//
//    public static int height(Node root) {
//        if (root == null) {
//            return 0;
//        }
//        return (Math.max(height(root.left), height(root.right)) + 1);
//    }
//
//    public static boolean isBalanced(Node root) {
//        if (root == null) {
//            return true;
//        }
//        int lh = height(root.left);
//        int rh = height(root.right);
//        return ((Math.abs(lh - rh) <= 1) && isBalanced(root.left) && isBalanced(root.right));
//    }
//
//    public static void main(String args[]) {
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        boolean flag = isBalanced(root);
//        System.out.println(flag);
//    }
//}
