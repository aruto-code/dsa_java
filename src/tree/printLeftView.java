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
//public class printLeftView {
//
//    static void printLeft(Node root){
//        if(root == null){
//            return;
//        }
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        while(q.isEmpty() == false){
//            int count = q.size();
//            for(int i = 0 ; i < count ; i++){
//                Node curr = q.poll();
//                if(i == 0){
//                    System.out.print(curr.key + " ");
//                }
//                if(curr.left != null){
//                    q.add(curr.left);
//                }
//                if(curr.right != null){
//                    q.add(curr.right);
//                }
//            }
//
//        }
//    }
//    public static void main(String args[]) {
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        printLeft(root);
//
//    }
//}
