package DSA_01;
/*
    rearrange the zeroes of the linked list
 */
class Node21{
    int data;
    Node21 next;
    Node21(int data){this.data=data;}
}

public class Deepanshu_sir {
    Node21 head = null;
    public void addLast(int val){
        Node21 newnode = new Node21(val);
        if(head==null){
            head = newnode;
        }
        else{
            Node21 temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("Linked List does not exist");
        }
        else{
            Node21 temp =head;
            while (temp!=null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
        }
    }
    public void allZeroes(Node21 head){
        if(head==null) return;
        Node21 prev = head;
        Node21 temp = head.next;
        while (temp!=null) {
                if(prev.data==0){
                    prev=prev.next;
                    temp=temp.next;
                }
                else if((prev.data!=0 && temp.data==0)) {
                    int x = prev.data;
                    prev.data = temp.data;
                    temp.data = x;
                }
                else if (prev.data != 0 && temp.data != 0)
                {
                    prev=prev.next;
                    temp=temp.next;
                }
        }
    }
    public static void main(String[] args) {
        Deepanshu_sir obj = new Deepanshu_sir();
        obj.addLast(0);
        obj.addLast(4);
        obj.addLast(0);
        obj.addLast(5);
        obj.addLast(0);
        obj.display();
        obj.allZeroes(obj.head);
        System.out.println();
        obj.display();
    }
}
