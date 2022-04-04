package DSA_01;

import java.util.Scanner;
//import

public class Question {
//    int a;
//
//    Question(){
//        this.a = a;
//    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        /*
        1+2+3+4+5,2+3+4+5,3+4+5,4+5,5
        15,14,12,9,5
        15+14+12+9+5
        55
         */

        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
        int [] arr = {5,4,3,2,1};
//        int a = 1;
        int temp=0;
        int a =0;
        for (int i = 0; i <arr.length; i++)
        {
            a = arr[i]*(i+1);
             temp +=a;
        }
//        temp = temp/arr[0];
        System.out.println(temp);

//        int a = 5*5+4*4+3*3+2*2+1;
//        System.out.println(a);
    }
}
