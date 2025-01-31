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
//public class printNodeDistanceK {
//    public static void printDist(Node root, int k){
//       if(root == null){
//           return ;
//       }
//       if(k == 0){
//           System.out.print(root.key + " ");
//       }
//       printDist(root.left, k-1);
//       printDist(root.right, k -1);
//    }
//    public static void main(String args[]){
//        Node root = new Node(90);
//        root.left = new Node(20);
//        root.right = new Node(70);
//        root.left.left = new Node(80);
//        printDist(root, 2);
//    }
//}
