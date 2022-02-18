package DSA_01;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Arrays;
import java.math.*;
import java.util.Scanner;

public class newLogic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a = sc.nextInt();
        int[] b = new int[size];
        int c=0;
        int temp=0;
        for (int i = 0; i < b.length; i++)
        {
            b[i] = a%10;
            a=a/10;
        }
        for (int i = b.length-1; i >=0; i--)
        {
            System.out.print(b[i]+"\t");
        }
        System.out.println();

        for (int i = 0; i < b.length; i++)//5,4,3,2,1
        {
            c=b[i]*(b.length-i);
            temp += c;
        }
        System.out.println(temp);
    }
}

