package DSA_01;

public class newStack {
    int[] ar;
    int top;
    newStack(){
        ar = new int[5];
        top =-1;
    }
    boolean isFull(){
        if(top==ar.length-1){
//            System.out.println("is full");
            return true;
        }else
           return false;
    }
    void push(int val){
        if(isFull()){
            System.out.println("stack full");
        }
        else{
            top++;
            ar[top] = val;

        }
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else
            return false;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("stack empty");
        }
        else{
            System.out.println(ar[top]);
            top--;
        }
    }

    void dis(){
        for (int i = 0; i < top+1; i++) {
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        newStack obj = new newStack();
        obj.push(23);
        obj.push(12);
        obj.push(89);
        obj.push(65);
        obj.push(90);
//        obj.push(23);
//        obj.dis();
        System.out.println(obj.isFull());
        System.out.println(obj.isEmpty());
    }
}
