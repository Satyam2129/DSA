package DSA_01;
class nodeS{
    int data;
    nodeS next;
    nodeS(int data){
        this.data=data;
    }
}
public class Queue {
    nodeS front=null;
    nodeS rear=null;

    public void enqueue(int val){
        nodeS newnode = new nodeS(10);
        if(front==null && rear==null){
            front = newnode;
            rear = newnode;
        }
        else{
            rear.next = newnode;
            rear = newnode;
        }
    }
    public void dequeue(){
            nodeS obj = new nodeS(10);
        if(front==null){
            System.out.println("underflow");
        }
        else{
            while (front!=null) {
                System.out.println(front.data);
//                front = obj;
            }
        }

    }

    public static void main(String[] args) {
        Queue obj1 = new Queue();
        obj1.enqueue(10);
        obj1.enqueue(20);
        obj1.dequeue();;
    }
}
