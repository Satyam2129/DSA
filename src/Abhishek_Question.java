class node10{
    int data;
    node10 next;
    node10(int data){
        this.data=data;
    }
}

public class Abhishek_Question {
    static node10 head;
    public static void addlast(int val){
        node10 newnode = new node10(val);
        if(head==null){
            head = newnode;
        }
        else{
            node10 temp = head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public static void addfirst(int data){
        node10 newnode = new node10(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }

    public static void addinBet(int val){
        node10 newnode = new node10(val);
        if(head==null){
            head=newnode;
        }
        else{
            node10 temp=head.next;
            node10 previous = head;
            while (temp.next!=null){
                temp=temp.next;
                previous=previous.next;
            }
        }
    }

}
