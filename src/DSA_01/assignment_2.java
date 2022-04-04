package DSA_01;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */
import java.util.Scanner;
public class assignment_2 {
    class Node1{
        int data;
        Node1 next;
        Node1(int val){
            data=val; next=null;
        }
    }
    class Node2 {
        int data;
        Node2 next;
        Node2(int val){
            data=val; next=null;
        }
    }
    Node1 head1=null;
    Node2 head2=null;
    public void insert1(int size){
        Scanner  s = new Scanner (System.in);
        Node1 temp=null;
        System.out.println("enter list 1: ");
        while(size-->0) {
            Node1 newnode1 = new Node1(s.nextInt());
            if (head1 == null) {
                head1 = newnode1;
                temp = head1;
            }
            else {
                temp.next=newnode1;
                temp = newnode1;
            }
        }
    }

    public void insert2(int size){
        Scanner s=new Scanner(System.in);
        System.out.println("enter list 2: ");
        Node2 temp=null;
        while(size-->0){
            Node2 newnode2 = new Node2(s.nextInt());
            if(head2==null){
                head2=newnode2;
                temp =head2;
            }
            else{
                temp.next=newnode2;
                temp = newnode2;
            }
        }
    }

    class resNode{
        int data;
        resNode next;
        resNode (int val){
            data=val;
            next = null;
        }
    }

    resNode head=null;

    public void algo(){
        Node1 temp1=head1; Node2 temp2=head2;
        resNode temp=null;
        if(temp1==null || temp2==null) {
            System.out.println("rejected");
        }

        int carry=0;
        while(temp1!=null || temp2!=null){
            int res = 0;
            if(temp1==null) {
                res=(temp2.data+carry)%10;
                carry=(temp2.data+carry)/10;
                temp2=temp2.next;
            }
            else if(temp2 == null){
                res=(temp1.data+ carry)%10;
                carry=(temp1.data+carry)/10;
                temp1=temp1.next;
            }
            else {
                res = (temp1.data+temp2.data+carry)%10;
                carry = (temp1.data+temp2.data+carry)/10;
                temp1=temp1.next;
                temp2=temp2.next;
            }
//            res = (temp1.data+temp2.data+carry)%10;
//            carry = (temp1.data+temp2.data+carry)/10;
//            temp1=temp1.next;
//            temp2=temp2.next;

            resNode resNew = new resNode(res);
            if(head==null){
                head = resNew;
                temp = head;
            }
            else {
                temp.next=resNew;
                temp=resNew;
            }
            if(temp1==null && temp2==null){break;}
        }
        if(carry>0){
            resNode last = new resNode(carry);
            temp.next=last;
            temp = last;
        }
    }

    public void disp(){
        resNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void display(){
        Node1 temp1 = head1;
        Node2 temp2 = head2;
        System.out.println("first list");
        while(temp1!=null){
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
        }
        System.out.println();//for the new line.
        System.out.println("second list");
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
        System.out.println();//for new line.
    }

    public static void main(String[] args) {
        assignment_2 obj = new assignment_2();
        Scanner s = new Scanner (System.in);
        System.out.println("enter the first list size");
        obj.insert1(s.nextInt());
        System.out.println("enter the second list size");
        obj.insert2(s.nextInt());
        obj.display();
        obj.algo();
        System.out.println("resultant list");
        obj.disp();
    }
}
