package DSA_01;

public class stack {
    int top;
    int arr[];

    public stack(int size){
        arr = new int[size];
        top =-1;
    }

    public boolean isFull(){
        if(top== arr.length-1){
            System.out.println("stack full");
            return true;
        }
        else
            return false;
    }

    public boolean isEmpty()
    {
        if(top==-1){
            System.out.println("stack empty");
            return true;
        }
        else
            return false;
    }

    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void push(int val){
        if(isFull()){
            System.out.println("stack overflow");
        }
        else{
            arr[top+1] = val;
            top++;
//            System.out.println("val inserted");
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
        }
        else{
            System.out.println(arr[top]);
            top--;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
//            arr[top]=0;
            System.out.println(arr[top]);
        }
    }
}

class test{
    public static void main(String[] args) {
        stack obj = new stack(5);
        obj.push(23);
        obj.push(50);
        obj.push(30);
        obj.push(43);
        obj.push(45);
//        obj.display();
//        obj.peek();
obj.pop();
obj.pop();
    }
}



class abc1{
    public static void main(String[] args) {
        int[][]  arr= new int[7][];
        for (int i = 1; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}