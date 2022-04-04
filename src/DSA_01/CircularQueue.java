package DSA_01;

public class CircularQueue
{
    int[] arr;
    int beginning;
    int top;
    int size1;
    public CircularQueue(int size1)
    {
        arr = new int[size1];
        this.size1 = size1;
        beginning =-1;
        top =-1;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else
            return false;
    }

    public boolean isfull(){
        if(top+1== beginning){
            return true;
        }
        else if((beginning==0) && (top== size1)){
            return true;
        }
        else
            return false;
    }
    public void enqueue(int val){
        if(isfull()){
            System.out.println("overflow");
        }
        else if(isEmpty()){
            beginning=0;
            top++;
            arr[top] = val;
        }
        else{
//            if()
        }
    }
}
