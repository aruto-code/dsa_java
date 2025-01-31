//import java.util.*;
//class Node{
//    int key ;
//    Node left;
//    Node right;
//    Node(int k){
//        key = k;
//    }
//}
//
//public class MaxInBInaryTree {
//
//    static int getMaximum(Node root){
//        if(root == null){
//            return 0;
//        }
//        return Math.max(root.key, Math.max(getMaximum(root.left), getMaximum(root.right)));
//    }
//
//    public static void main(String args[]) {
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        int x = getMaximum(root);
//        System.out.println(x);
//
//    }
//}
