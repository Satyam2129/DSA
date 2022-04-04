package DSA_01;

import org.w3c.dom.Node;

class Node1{
    int data;
    int data1;
    Node next;
}

public class StackUsingSinglyLinkedList {
    Node top = null;

    public void push(){
        Node1 newnode = new Node1();
        newnode.next = top;
        top = (Node) newnode;
    }

    public void pop(){
        while(top!=null){
            System.out.println(top);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,8,3,2,7,4};
        int mul_max = 0;
        int mul_min =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]*arr[j]>mul_max){
                    mul_max = arr[i]*arr[j];
                }
                if(arr[i]*arr[j]<mul_min){
                    mul_min =arr[i]*arr[j];
                }
            }
    }
        System.out.println(mul_max);
        System.out.println(mul_min);
}
}


