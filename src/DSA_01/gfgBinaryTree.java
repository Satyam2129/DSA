package DSA_01;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int key;
    Node2 left;
    Node2 right;
    Node2(int k){
        key=k;
    }
}


public class gfgBinaryTree {

    void inOrder(Node2 root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }

    void preOrder(Node2 root){
        if(root!=null){
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node2 root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }

    int height(Node2 root){
        if(root==null)
            return 0;
        else return Math.max(height(root.left),height(root.right)) + 1;
    }

    void levelOrder(Node2 root){
        if(root==null) return;
        Queue<Node2> obj = new LinkedList();
        obj.add(root);
        while (obj.isEmpty()==false){
            Node2 curr = obj.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null) obj.add(curr.left);
            if (curr.right!=null) obj.add(curr.right);
        }
    }

    void LineByLine(Node2 root){
        if(root==null){
            return;
        }
        Queue<Node2> obj = new LinkedList<>();
        obj.add(root);
        obj.add(null);
        while (obj.size()>1) {
            Node2 curr = obj.poll();
            if(curr==null){
                System.out.println();
                obj.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if (curr.left!=null) obj.add(curr.left);
            if (curr.right!=null) obj.add(curr.right);
        }
    }

    int getSize(Node2 root){
        if (root==null) return 0;
        else return 1+ getSize(root.left)+getSize(root.right);
    }

    void levelbylevel(Node2 root){
        if(root==null) return;
        Queue<Node2> obj = new LinkedList<>();
        obj.add(root);
        while (obj.isEmpty()==false){
            int count = obj.size();
            for (int i = 0; i < count; i++) {
                Node2 curr = obj.poll();
                System.out.print(curr.key+" ");
                if (curr.left!=null) obj.add(curr.left);
                if (curr.right!=null) obj.add(curr.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node2 root = new Node2(10);
        root.left = new Node2(20);
        root.right=new Node2(30);
        root.left.left=new Node2(40);
        root.left.right=new Node2(50);
        root.right.left=new Node2(60);
        root.right.right=new Node2(70);
        gfgBinaryTree obj = new gfgBinaryTree();
        obj.inOrder(root);
        System.out.println();
        obj.preOrder(root);
        System.out.println();
        obj.postOrder(root);
        System.out.println();
        System.out.print(obj.height(root));
        System.out.println();
        obj.levelOrder(root);
        System.out.println();
        obj.LineByLine(root);
        System.out.println();
        obj.levelbylevel(root);
        System.out.println(obj.getSize(root));

    }
}
