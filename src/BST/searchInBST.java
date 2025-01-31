//class Node{
//    int key;
//    Node right;
//    Node left;
//    Node(int x){
//        key = x;
//    }
//
//}
//public class searchInBST {
//    public static boolean search(Node root, int x){
//        if(root == null){
//            return false;
//        }
//        if(root.key == x){
//            return true;
//        }
//        if(root.key < x){
//            return search(root.right, x);
//        }
//        else {
//            return search(root.left, x);
//        }
//    }
//    public static boolean searchIterative(Node root, int x){
//        while(root != null){
//            if(root.key == x){
//                return true;
//            }
//            else if(root.key < x){
//                root = root.right;
//            }
//            else{
//                root = root.left;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Node root = new Node(15);
//        root.left = new Node(5);
//        root.right = new Node(20);
//        root.left.left = new Node(3);
//        root.right.left = new Node(18);
//        root.right.right = new Node(80);
//        int x = 80;
//        boolean flag = searchIterative(root, x);
//        System.out.println(flag);
//    }
//}
