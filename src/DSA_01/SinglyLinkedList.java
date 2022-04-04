package DSA_01;

import org.w3c.dom.Node;

import java.util.LinkedList;

class new1{
    int data;
    Node next;
    public new1(int data){
        this.data = data;
    }
        }
public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
    }
}

class SinglyLinkedList1 {
    class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SinglyLinkedList1 obj = new SinglyLinkedList1();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);
        obj.display();
    }
}

class dNode{
    int a;
    Node next;
    Node prev;

    public dNode(int a, Node next, Node prev){
        this.a =a;
        this.next = null;
        this.prev = null;
    }

    public Node head = null;
    public Node tail = null;

}

class DoublyLinkedList{

}