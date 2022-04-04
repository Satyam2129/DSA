import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;
// Sem-IV Mid-Term

public class new1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack obj = new Stack<>();
        for (int i = str.length()-1; i >=0 ;i--)
        {
            obj.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++)
        {
            System.out.print(obj.pop());
        }
    }
}
// linked list

class node1{
    node1 next;
    int data;

    node1(int data){
        this.data = data;
    }
}

class SLL{
    node1 head = null;

    public void Insertfromfirst(int data){
        node1 newNode = new node1(data);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next=head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        node1 newNode = new node1(data);
        node1 temp = head;
        if(head==null){
            head = newNode;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
//                System.out.print(temp.data+"\t");
            }
            temp.next = newNode;
        }

    }
    public void insertAtPosition(int pos,int data){
        int i=1;
        node1 newNode = new node1(data);
        node1 temp=head;
        if(head==null){
            System.out.println("no list");
        }
        while(i<pos){
            i++;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteLast(){
        node1 previous=head;
        node1 temp=head.next;
        if (head == null) {
            System.out.println("empty");
        }
        if(temp==null){
            head=null;
        }
        while(temp.next!=null){
            temp=temp.next;
            previous=previous.next;
        }
        previous.next=null;

    }
    public  void traverse(){
        node1 temp=head;
        while (temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        SLL o = new SLL();
        o.Insertfromfirst(10);
        o.Insertfromfirst(20);
        o.addLast(30);
        o.insertAtPosition(2,37);
        o.deleteLast();
        o.traverse();
    }
}

class abc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.print(n);
    }
}

class rec{
    public int sum(int N){
        if(N==1) return 1;
        else{
            return N + sum(N-1);
        }
    }

    public int fac(int N){
        if(N==0||N==1) return 1;
        else
            return N*fac(N-1);//tail
    }

    public int fact1(int N){
        if(N==0||N==1) return 1;//head
        int i = fact1(N-1);
        i = i*N;
        return i;
    }

    public int fibo(int N){
        if(N==0)
        {
            return 0;
        }
        else if(N==1||N==2){
            return 1;
        }
        else{
            return fibo(N-2) + fibo(N-1);
        }
    }
    public int power(int pow, int base){
         if(base==0 && pow==0){
            return 1;
        }
        else if(base==0){
            return 0;
        }
        else if(pow==0){
            return 1;
        }
        else{
            return base*power(pow-1,base);
        }
    }

    public void decTobin(int N){
        if(N==0){
            System.out.println(0);
        }
        else if(N==1){
            System.out.print(1);
        }
        else{
            if(N>1){
                decTobin(N/2);
                System.out.print(N%2);
            }
        }

    }

    public void fiboSer(int n){
        int i=0;
        while(i<=n){

        }

    }


    public static void main(String[] args) {
        rec obj = new rec();
        System.out.println(obj.sum(5));
        System.out.println(obj.fac(5));
        System.out.println(obj.fibo(4));
        System.out.println(obj.fact1(4));
        System.out.println(obj.power(3,3));
        obj.decTobin(6);
//        obj.fiboSer(5);
    }
}

class node{
    node next;
    int data;
    node(int data){
        this.data=data;
    }
}

class test{
    node top;
    public boolean isEmpty(){
        if(top==null)
            return true;
        else
            return false;
    }
    public void push (int data){
        node newnode = new node(data);
        newnode.next = top;
        top=newnode;
    }
    public void pop(){
        if(top==null){
            System.out.println("empty list");
        }
        int r= top.data;
        top = top.next;
        System.out.println(r);
    }

    public static void main(String[] args) {
        test obj = new test();
        obj.push(23);
        obj.push(34);
        obj.push(21);
        obj.pop();
        obj.pop();
        obj.pop();
        System.out.println(obj.isEmpty());
    }
}

class queue{
    int arr[];
    int front;
    int rear;
    queue(int size){
        arr= new int[size];
        front=-1;
        rear=-1;
    }

    public boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }
        else
            return false;
    }
}

//    public boolean isFull(){
////        if();
//    }
//}

class check{
    int top=-1;
    String str = "naman";
    char[] ch= new char[str.length()];
    String str1;
public void push(){
    for (int i = 0; i < str.length(); i++) {
        top++;
        ch[top]=str.charAt(i);
    }
}
public void pop(){
    for (int i = 4; i >=3; i--) {
        str1= String.valueOf(ch[top]);
        str1=str1.concat(String.valueOf(ch[top]));
//        System.out.println(str1);
        top--;
    }
    for (int i =2; i >=0 ; i--) {
        str1=str1.concat(String.valueOf(ch[top]));
        System.out.println(str1);
        top--;
    }
    if(str.equals(str1)){
        System.out.println("yes");
    }else{
        System.out.println("no");
    }
}
    public static void main(String[] args) {
        check obj = new check();
        obj.push();
        obj.pop();

    }
}


class abcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue obj = new LinkedList();
        for (int i = 0; i < 5; i++) {
            obj.add(sc.nextInt());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(obj.poll()+"\t");
        }
    }
}