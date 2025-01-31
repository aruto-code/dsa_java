//class node{
//    int key ;
//    node left;
//    node right;
//    node(int k){
//        key = k;
//    }
//}
//
//public class test {
//    public static void inorder(node root){
//        if(root != null) {
//            inorder(root.left);
//            System.out.print(root.key + " ");
//            inorder(root.right);
//        }
//    }
//    public static void preorder(node root){
//        if(root != null) {
//            System.out.print(root.key + " ");
//            inorder(root.left);
//            inorder(root.right);
//        }
//    }
//    public static void postorder(node root){
//        if(root != null) {
//            inorder(root.left);
//            inorder(root.right);
//            System.out.print(root.key + " ");
//        }
//    }
//
//
//    public static void main(String args[]) {
//        node root = new node(10);
//        root.left = new node(20);
//        root.right = new node(50);
//        root.left.left = new node(70);
//        inorder(root);
//        System.out.println();
//        preorder(root);
//        System.out.println();
//        postorder(root);
//
//    }
//}
