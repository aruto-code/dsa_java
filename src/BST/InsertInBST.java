//class Node {
//    int key;
//    Node right;
//    Node left;
//
//    Node(int x) {
//        key = x;
//    }
//}
//
//    public class InsertInBST {
//        public static Node insertRecursive(Node root, int x){
//            if(root == null){
//                return new Node(x);
//            }
//            if(root.key > x){
//                root.left = insertRecursive(root.left,x);
//            }
//            else if (root.key < x){
//                root.right = insertRecursive(root.right, x);
//            }
//            return root;
//        }
//        public static Node insert(Node root, int x){
//            Node temp = new Node(x);
//            Node curr = root, parent =  null;
//            while(curr != null){
//                parent = curr;
//                if(curr.key > x){
//                    curr = curr.left;
//                }
//                else if (curr.key < x){
//                   curr = curr.right;
//                }
//                else{
//                    return root;
//                }
//            }
//            if(parent == null){
//                return temp;
//            }
//            else if(x > parent.key){
//                parent.right = temp;
//            }
//            else {
//                parent.left = temp;
//            }
//            return root;
//
//        }
//        public static void main(String[] args) {
//            Node root = new Node(15);
//            root.left = new Node(5);
//            root.right = new Node(20);
//            root.left.left = new Node(3);
//            root.right.left = new Node(18);
//            root.right.right = new Node(80);
//            int x = 80;
//            InsertInBST.insertRecursive( root, x);
//
//    }
//}
