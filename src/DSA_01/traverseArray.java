package DSA_01;

import java.util.Scanner;

class Student
{
    int rollNo;
    int marks;
    String name;

    public Student(int rollNo,String name,int marks)
    {
        this.marks= marks;
        this.name = name;
        this.rollNo = rollNo;
    }
}
public class traverseArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[5];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new Student(sc.nextInt(),sc.next(),sc.nextInt());
        }
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i].rollNo+"\t"+arr[i].name+"\t"+arr[i].marks);
        }
    }
}

class SumDiffLargestandSmallestElements{
    public static void main(String[] args) {
        int arr[] = {20,30,40,50,70};
        int max_value = arr[0];
        int min_value = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max_value){
                max_value =arr[i];
            }
            else if(arr[i]<min_value){
                min_value = arr[i];
            }
        }
        System.out.println("Max value: "+ max_value);
        System.out.println("Min value: "+ min_value);
        System.out.println("Sum of Max and Min value: "+ (max_value+min_value));
        System.out.println("Diff of Max and Min value: "+ (max_value-min_value));
    }
}