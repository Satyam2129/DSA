package DSA_01;

class node3{
    int data ;
//    node root;
    node3 left;
    node3 right;
    node3(int data){
        this.data=data;
    }
}

public class gfgBST {
    public boolean search(node3 root,int val){
//        node3 root = new node3(val);
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        else if(root.data>val){
            return search(root.left,val);
        }
        else{
            return search(root.right,val);
        }
    }

    public node3 insert(node3 root,int val) {
        if(root==null){
            return new node3(val);
        }
        else if(root.data>val){
            root.left=insert(root.left,val);
        }
        else if(root.data<val){
            root.right=insert(root.right,val);
        }
        return root;
    }

    public void inorder(node3 root){
        if(root==null){
            return;
        }
        else{
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public node3 getsucc(node3 root){
        node3 curr =root.right;
        while (curr!=null && curr.left!=null)
            curr=curr.left;
        System.out.println(curr.data);
        return curr;
    }
    public node3 delnode(node3 root,int val){
        if(root==null){
            return null;
        }
        if(root.data>val){
            root.left = delnode(root.left,val);
        }
        else if(root.data<val){
            root.right=delnode(root.right,val);
        }
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                node3 succ = getsucc(root);
                root.data=succ.data;
                root.right=delnode(root.right,val);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        gfgBST obj = new gfgBST();
        node3 root = new node3(10);
        obj.insert(root,20);
        obj.insert(root,2);
        obj.insert(root,67);
        obj.insert(root,21);
        obj.insert(root,1);
        obj.insert(root,7);
        obj.inorder(root);
        System.out.println();
        System.out.println(obj.search(root,90));
        obj.getsucc(root);
        obj.delnode(root,20);
        obj.inorder(root);
    }
}
