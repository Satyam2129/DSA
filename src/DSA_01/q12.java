package DSA_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class q12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[size];
        int[] res = new int[size];
        int i=0;
        for (; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        try {

            for (int j = 0; j < res.length; j++) {
                if(arr[j]>=arr.length){
                    throw new ArrayIndexOutOfBoundsException("element value greater than size of array");
                }else{
                    res[j] = arr[arr[i]];
                }
            }
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[j] + "\t");
            }
        }catch (ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);
        }
    }
}
class main1
{
    public static void main(String[] args)
    {
        int[] a= {1, 4, 14, 8, 22, 222,44};
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++)
        {

            if(i%2==0){
                int temp=0;
                temp = a[i];
                a[i]=  a[i+1];
                a[i+1] = temp;
//                i++;
            }
//
//            {
//                int temp=0;
//                temp = a[i];
//                a[i]=  a[i+1];
//                a[i+1] = temp;
//            }

        }
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}

// sorting of an array using single loop

class main
{
    public static void main(String[] args)
    {
        int[] arr= {10,22,78,45,67,89,34,0};
        for (int i = 0; i < arr.length-1; i++)
        {
            if(arr[i]<arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}

class main6{
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,0};
//        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            arr[i]=arr[arr[i]];
            arr[arr[i]]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

class ab1{
    public static void main(String[] args) {
        int a=3,b=4;
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}


 class Solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alice = 0, bob = 0, i = 0,j=0;
        System.out.println("enter the size");
        int size = sc.nextInt();
        System.out.println("enter 1st array");
        int[] arr = new int[size];
        for (; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("enter 2nd array");
            int[] arr1 = new int[size];
            for (; j < arr1.length; j++) {
                arr1[j] = sc.nextInt();
        }
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] > arr1[k]) {
                        alice++;
                    }
                    if (arr1[k] > arr[k]) {
                        bob++;
                    }
                }
                int[] res = new int[2];
                res[0] = alice;
                res[1] = bob;
                for (int k = 0; k < res.length; k++) {
                    System.out.print(res[k] + " ");
                }
            }
        }
class generic{
    public static void m1(){
        Stack obj = new Stack();
        Scanner sc= new Scanner(System.in);
//        int size = sc.nextInt();
        int[] arr = new int[4];
            obj.push(1);
            obj.push(2);
            obj.push(3);
            obj.push(4);
        if(4%2==0)
        {
            for (int i = 0; i < 4/2; i++) {
                System.out.println(obj.pop());
            }
        }

    }

    public static void main(String[] args) {
        m1();
    }
}

