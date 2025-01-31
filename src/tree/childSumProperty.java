//class Node{
//    int key ;
//    Node left;
//    Node right;
//    Node(int k){
//        key = k;
//    }
//}
//
//public class childSumProperty {
//    static boolean isCsum(Node root) {
//        if(root == null){
//            return true;
//        }
//        if(root.left == null && root.right == null){
//            return true;
//        }
//        int sum = 0;
//        if(root.left!= null){
//            sum = sum + root.left.key;
//        }
//        if(root.right != null){
//            sum = sum + root.right.key;
//        }
//        return (root.key == sum && isCsum(root.left) && isCsum(root.right));
//
//    }
//
//    public static void main(String args[]) {
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        boolean flag = isCsum(root);
//        System.out.println(flag);
//
//
//    }
//}
