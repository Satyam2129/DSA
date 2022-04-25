package DSA_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Graph {
    HashMap<Integer,Integer> obj1;
    Graph(){
        obj1= new HashMap<>();
    }

    public void insert(){
        Scanner sc = new Scanner(System.in);
        obj1.put(sc.nextInt(),sc.nextInt());
    }
    public void display(){
        for (Map.Entry<Integer,Integer> res: obj1.entrySet()
             ) {
            System.out.print(res.getKey()+" ");
            System.out.println(res.getValue());
        }
    }

    public static void main(String[] args) {
//        HashMap<Integer,Integer> obj = new HashMap<>();
//        obj.put(10,100);
//        obj.put(20,200);
//        obj.put(30,300);
//        for (Map.Entry<Integer,Integer> Res: obj.entrySet()) {
//            System.out.print(Res.getKey()+" ");
//            System.out.println(Res.getValue());
//        }
        Graph obj = new Graph();
        obj.insert();
        obj.insert();
        obj.display();
    }
}
