class BinaryNode{
    int data;
    BinaryNode left;
    BinaryNode right;
   public BinaryNode(int data){
        this.data=data;
    }
}


public class TreeDSA {
    public static void print(BinaryNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        if(root.left!=null && root.right!=null) {
            System.out.print(" L"+root.left.data);
            System.out.print(" ,R"+root.right.data);
        }
       else if(root.right!=null) {
            System.out.print(" R"+root.right.data);
        }
       else if(root.left!=null){
            System.out.print(" L"+root.left.data);
        }

        System.out.println();

        print(root.left);
        print(root.right);
    }

    public static void preorder(BinaryNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inOrder(BinaryNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(BinaryNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(10);
        BinaryNode rleft = new BinaryNode(5);
        BinaryNode rRight = new BinaryNode(20);
        BinaryNode rleftleft = new BinaryNode(3);
        BinaryNode rleftright = new BinaryNode(8);
        root.left=rleft;
        root.right=rRight;
        root.left.left= rleftleft;
        root.left.right=rleftright;
        print(root);
        System.out.println();
        preorder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
// Binary tree using array

class BinaryTreeUsingArray{
    int arr[];
    int lastusedindex;
    public BinaryTreeUsingArray(int size){
        arr=new int[size+1];
        lastusedindex=0;
    }
    public void insert(int value){
        if (lastusedindex>=arr.length-1){
            System.out.println("can't be inserted");
        }

        else{
            arr[lastusedindex+1]=value;
            lastusedindex++;
        }
    }

    public void preorderTraversal(int index){
        if(index>lastusedindex){
            return;
        }
        else{
            System.out.print(arr[index]+"\t");
            preorderTraversal(2*index);
            preorderTraversal(2*index+1);
        }
    }

    public int search(int value){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==value){
                return 1;
            }
        }
        return -1;
    }

    public void delete(int value){
        int res = search(value);
        int index=0;
        for (int i = 1; i < arr.length; i++) {
            if(value==arr[i]){
                index=i;
            }
        }
        if(res==-1){
            System.out.println("value not present");
        }
        else{
            arr[index]=arr[lastusedindex];
            lastusedindex--;
            System.out.println("value successfully deleted");
        }
    }

    public static void main(String[] args) {
        BinaryTreeUsingArray obj = new BinaryTreeUsingArray(6);
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
//        obj.insert(70);
//        obj.insert(80);
        obj.preorderTraversal(1);
        System.out.println();
        System.out.println(obj.search(50));
        obj.delete(30);
        obj.preorderTraversal(1);
    }
}