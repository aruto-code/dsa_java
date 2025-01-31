//class Node{
//    int key ;
//    Node left;
//    Node right;
//    Node(int k){
//        key = k;
//    }
//}
//
//public class sizeOfBinaryTree{
//    static int getSize(Node root) {
//        if(root == null){
//            return 0;
//        }
//        return 1+ getSize(root.left) + getSize(root.right);
//    }
//
//    public static void main(String args[]) {
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        int x = getSize(root);
//        System.out.println(x);
//
//    }
//}
