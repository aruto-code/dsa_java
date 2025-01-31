//class Node{
//    int key ;
//    Node left;
//    Node right;
//    Node(int k){
//        key = k;
//    }
//}
//
//public class hieghtOfTree {
//    public static int height(Node root){
//        if(root == null){
//            return 0;
//        }
//        else
//            return Math.max(height(root.left), height(root.right)) + 1;
//    }
//    public static void main(String args[]){
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        int len = height(root);
//        System.out.println(len);
//    }
//}
