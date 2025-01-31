class Node {
    int key;
    Node right;
    Node left;

    Node(int x) {
        key = x;
    }
}

public class deleteInBST {

    static Node getSucc(Node root){
        Node curr =  root.right;
        while(curr != null & curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
    public static Node del(Node root, int x){
        if(root == null){
            return null;
        }
        else if(root.key > x){
            root.left = del(root.left, x);
        }
        else if(root.key < x){
            root.right = del(root.right, x);
        }
        else {
            if (root.left == null) {
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else {
                Node succ = getSucc(root);
                root.key = succ.key;
                root.right = del(root.right, succ.key);
            }
            }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);

    }
}
