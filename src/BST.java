public class BST {
    class Node {
        int key;
        Node left, right;
    }

    Node newNode(int data) {
        Node temp = new Node();
        temp.key = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    Node insert(Node root, int key) {

        Node newnode = newNode(key);
        Node x = root;
        Node y = null;

        while (x != null) {
            y = x;
            if (key < x.key)
                x = x.left;
            else
                x = x.right;
        }
        if (y == null)
            y = newnode;
        else if (key < y.key)
            y.left = newnode;
        else
            y.right = newnode;
        return y;
    }

    public void Inorder(Node root) {
        if (root == null)
            return;
        else {
            Inorder(root.left);
            System.out.print(root.key + " ");
            Inorder(root.right);
        }
    }
    public void InBet(Node temp) {
        if (temp == null){
            return;
        }
        if(temp.key>10 && temp.key<50)
            System.out.print(temp.key + " ");
            InBet(temp.left);
            InBet(temp.right);

    }

    public void printMin(Node temp){
        if(temp==null){
            return;
        }
        else{
            if(temp.left==null){
                System.out.println(temp.key);
            }
            printMin(temp.left);
        }
    }
    public void printMax(Node temp){
        if(temp==null){
            return;
        }
        else{
            if(temp.right==null){
                System.out.println(temp.key);
            }
            printMax(temp.right);
        }
    }
    public static void main(String args[]) {
        Node root = null;
        BST obj = new BST();
        root = obj.insert(root, 50);
        obj.insert(root, 30);
        obj.insert(root, 20);
        obj.insert(root, 40);
        obj.insert(root, 70);
        obj.insert(root, 60);
        obj.insert(root, 80);
        obj.Inorder(root);
        System.out.println();
        obj.printMin(root);
        obj.printMax(root);
        obj.InBet(root);

    }
}
