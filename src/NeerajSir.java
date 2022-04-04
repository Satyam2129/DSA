class node12{
    int data;
    node12 next;
    node12(int data){
        this.data=data;
    }
}

class test12{
    node12 head=null;
    public void addl(int data){
        node12 newnode = new node12(data);
        if(head==null){
            head = newnode;
        }
        else {
            node12 temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=newnode;
        }
    }
    public int sizeofSL(){
        int size=0;
        node12 temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
    public void display(){
        node12 temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void check(int x){
        node12 temp = head;
        if(head.data==x){
            head=head.next;
        }
        while (temp.next!=null){
            if(x==temp.data){

            }
            else{
                node12 newnode = new node12(x);
                temp.next=newnode;
            }
        }
    }
}
public class NeerajSir {
    public static void main(String[] args) {
        test12 obj = new test12();
        obj.addl(32);
        obj.addl(21);
        obj.addl(65);
        obj.addl(90);
        obj.addl(34);
        obj.display();
        System.out.println(obj.sizeofSL());
    }
}
class new2{
    public static void main(String[] args) {
        int i=0;
        while (i<9){
            System.out.print("satyam"+" ");
            i++;
        }
    }
}