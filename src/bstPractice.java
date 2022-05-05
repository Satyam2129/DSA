class node4{
    int data;
    node4 left;
    node4 right;
    node4(int data){
        this.data=data;
    }
}
public class bstPractice {
    public node4 insert1(node4 root,int val){
        if(root==null){
            return new node4(val);
        }
        else{
            if(root.data>val){
                root.left=insert1(root.left,val);
            }
            else if(root.data<val){
                root.right=insert1(root.right,val);
            }
        }
        return root;
    }

    public void inO(node4 root){
        if(root==null){
            return;
        }
        else{
            inO(root.left);
            System.out.print(root.data+" ");
            inO(root.right);
        }
    }

    public boolean search(node4 root,int val){
        if(root==null){
            return false;
        }
        else if(root.data==val){
            return true;
        }
        else if(root.data<val){
            return search(root.right,val);
        }
        else{
            return search(root.left,val);
        }
    }

    public node4 getsucc(node4 root){
        node4 curr = root.right;
        while (curr!=null && curr.left!=null)
            curr=curr.left;
        System.out.println(curr.data);
        return curr;
    }

    public node4 del(node4 root, int val){
        if(root==null){
            return null;
        }
        else if(root.data>val){
            root.left=del(root.left,val);
        }
        else if(root.data<val){
            root.right=del(root.right,val);
        }
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                node4 succ = getsucc(root);
                root.data= succ.data;
                root.right=del(root.right,val);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        bstPractice obj = new bstPractice();
        node4 root = new node4(50);
        obj.insert1(root,10);
        obj.insert1(root,70);
        obj.insert1(root,20);
        obj.insert1(root,30);
        obj.insert1(root,100);
        obj.insert1(root,34);
        obj.insert1(root,89);
        obj.inO(root);
        System.out.println();
        System.out.println(obj.search(root,34));
        System.out.println(obj.search(root,56));
        obj.getsucc(root);
        obj.del(root,10);
        obj.inO(root);
    }
}
