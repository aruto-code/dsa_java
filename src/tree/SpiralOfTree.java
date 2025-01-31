import java.util.LinkedList;

import java.util.*;
class node{
    node left;
    node right;
    int key;

    node(int k ){
        this.key = k;
    }
}


public class SpiralOfTree {

    static void method1(node root){
        boolean reverse = false;
        if(root == null){
            return ;
        }
        Queue<node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0 ;i < count ; i++) {
                node curr = q.poll();
                if(reverse){
                    s.push(curr.key);
                }
                else{
                    System.out.print(curr.key + " ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            if(reverse){
            while(s.isEmpty() == false){
                    System.out.print(s.pop() + " ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }
    static void method2(node root){
        if(root == null){
            return ;
        }
        Stack<node> s1 = new Stack<>();
        Stack<node> s2 = new Stack<>();
        s1.push(root);
        while(s1.isEmpty() == false || s2.isEmpty() == false){
            while(s1.isEmpty() == false){
                node curr = s1.pop();
                System.out.print(curr.key + " ");
                if(curr.left != null){
                    s2.push(curr.left);
                }
                if(curr.right != null){
                    s2.push(curr.right);
                }
            }
            while(s2.isEmpty() == false){
                node curr = s2.pop();
                System.out.print(curr.key + " ");
                if(curr.right != null){
                    s1.push(curr.right);
                }
                if(curr.left != null){
                    s1.push(curr.left);
                }
            }
        }
    }

    public static void main(String[] args) {
        node root = new node(90);
        root.left = new node(20);
        root.right = new node(70);
        root.left.left = new node(80);
        //method1(root);
        method2(root);
    }
}
