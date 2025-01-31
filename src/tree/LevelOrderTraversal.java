//import java.util.LinkedList;
//import java.util.Queue;
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
//public class LevelOrderTraversal {
//    static void printLevel(Node root) {
//        if (root == null) {
//            return;
//        }
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        while (q.isEmpty() == false) {
//            Node curr = q.poll();
//            System.out.print(curr.key + " ");
//            if (curr.left != null) {
//                q.add(curr.left);
//            }
//            if (curr.right != null) {
//                q.add(curr.right);
//            }
//        }
//
//    }
//    static void printLevelInLine(Node root) {
//        if (root == null) {
//            return;
//        }
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        while (q.size() > 1) {
//            Node curr = q.poll();
//            if(curr == null){
//                System.out.println();
//                q.add(null);
//                continue;
//            }
//            System.out.print(curr.key + " ");
//            if (curr.left != null) {
//                q.add(curr.left);
//            }
//            if (curr.right != null) {
//                q.add(curr.right);
//            }
//        }
//
//    }
//
//    public static void main(String args[]) {
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        printLevel(root);
//        System.out.println();
//        printLevelInLine(root);
//    }
//}
