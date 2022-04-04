package DSA_01;
/*
Q. Create an array of 10 students and print the record of those students
who got the highest marks and who got minimum marks. The structure of student class is as follows
class Student
{
	private int rollno;
	private int marks
	private String name;
}
// create constructor or getter and setter methods as per need
 */

import java.util.Scanner;

class Stu{
    private int rollno;
    private int marks;
    private String name;

    public Stu setrollno(int rollno){
        this.rollno = rollno;
        return null;
    }
    public  int getrollno(){
        return rollno;
    }
    public Stu setmarks(int marks)
    {
        this.marks = marks;
        return null;
    }
    public  int getmarks()
    {
        return marks;
    }
    public  Stu setname(String name)
    {
        this.name = name;
        return  null;
    }
    public String getname()
    {
        return name;
    }
}
public class Q_1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Stu arr[] = new Stu[10];
        Stu obj = new Stu();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = obj.setrollno(sc.nextInt());
        }

    }
}
