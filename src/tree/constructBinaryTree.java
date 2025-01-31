//
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
//public class constructBinaryTree {
//    public  static int preIndex = 0;
//    public static Node cTree(int in[], int pre[], int is, int ie){
//        if(is > ie){
//            return null;
//        }
//        Node root = new Node(pre[preIndex++]);
//        int index = -1 ;
//        for(int i = is ; i <= ie ; i++){
//            if(in[i] == root.key){
//                index = i;
//                break;
//            }
//        }
//        root.left = cTree(in, pre, is ,index - 1);
//        root.right  = cTree(in , pre, index + 1, ie);
//        return root;
//
//    }
//    public static void main(String[] args) {
//        int in[]  = {40, 20, 50, 10, 30, 80, 70 , 90};
//        int pre[] = {10, 20, 40, 50, 30, 70 , 80, 90};
//        int is = 0, ie = pre.length - 1;
//        cTree(in , pre, is, ie);
//    }
//}
