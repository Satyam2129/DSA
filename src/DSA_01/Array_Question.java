package DSA_01;

import java.util.Scanner;

class def{
    Scanner sc = new Scanner(System.in);
    int size =sc.nextInt();
    int[] arr1;
    public void sort(){
         arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= sc.nextInt();
        }
        for (int i = 0; i < arr1.length-1; i++) {
            if(arr1[i]>arr1[i+1]){
                int temp=arr1[i];
                arr1[i]=arr1[i+1];
                arr1[i+1]=temp;
                i=-1;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
    }

    public void logic(){
        sort();
        for (int i = 0; i < arr1.length-1; i++) {
            if(i%2==0){
                int temp=arr1[i];
                arr1[i]=arr1[i+1];
                arr1[i+1]=temp;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }
}

public class Array_Question {
    public static void main(String[] args) {
        def obj = new def();
        obj.logic();
    }
}
