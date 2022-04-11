package DSA_01;
import java.io.*;
import java.util.*;

class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        char ch[] = a.toLowerCase().toCharArray();
        char ch1[] = b.toLowerCase().toCharArray();
        if(ch.length!=ch1.length){
            System.out.println("Not Anagrams");
        }
        else{
            Arrays.sort(ch);
            Arrays.sort(ch1);
            if(Arrays.equals(ch,ch1)==true){
                System.out.println("Anagrams");
            }else{
                System.out.println("Not Anagrams");
            }


        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

public class Hackerrank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String arr[] = a.split("[ ,'@?!#$%^&*;:><]+");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}

// compare the triplet

class test2 {
    public static int[] comparethetriplet() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int arr1[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr1[i]) {
                arr2[0]++;
            } else if (arr[i] < arr1[i]) {
                arr2[1]++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        return arr2;
    }

    public static void main(String[] args) {
        comparethetriplet();
    }
}

// add the array

class test3{
    public static long sumofarray(){
        Scanner scs = new Scanner(System.in);
        int size =scs.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scs.nextInt();
        }
        long sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumofarray());
    }
}
//2d array

class matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j <arr.length ; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j <arr.length ; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

//reverse a given string
class hack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String arr[] = a.split("\\.");
        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+".");
            }
        }
    }
}
// delete middle node in linked list
class hack1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        LinkedList obj = new LinkedList();
        int size = sc.nextInt();
        for (int i = 1; i <=size ; i++) {
            obj.add(sc.nextInt());
        }
        obj.remove(size/2);
        for (int i = 1; i <= size-1; i++) {
            System.out.print(obj.remove()+" ");
        }
    }
}