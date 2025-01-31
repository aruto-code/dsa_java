
import java.util.*;
class Node {
    Node left;
    Node right;
    int key;
    Node(int k ){
        key = k;
    }
}
public class LCA {
    static boolean findPath(Node root, ArrayList<Node> p, int n){
        if(root == null){
            return false;
        }
        p.add(root);
        if(root.key == n){
            return true;
        }
        if(findPath(root.left, p, n) || findPath(root.right, p, n)){
            return true;
        }
        p.remove(p.size() - 1);
        return false;
    }

    public static Node Lcamethod1(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if(findPath(root, path1, n1) == false || findPath(root, path2, n1) == false){
            return null;
        }
        for(int i = 0; i < path1.size() - 1 && i < path2.size() -1 ; i++) {
            if (path1.get(i + 1) != path2.get(i + 1)) {
                return path1.get(i);
            }
        }
        return null;

    }

    public static Node lcamethod2(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.key == n1 || root.key == n2){
            return root;
        }
        Node lca1 = lcamethod2(root.left, n1, n2);
        Node lca2 = lcamethod2(root.right, n1, n2);

        if(lca1 != null && lca2 != null){
            return root;
        }
        if(lca1 != null){
            return lca1;
        }
        else {
            return lca2;
        }
    }
    public static void main(String[] args) {

    }
}
