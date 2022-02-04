package DSA_01;


import java.util.Scanner;

public class Q1_decToBin {

    public static void decTobin(int n){
        if(n>0){
            decTobin(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. you want to convert to Binary");
        int a = sc.nextInt();
        System.out.println(a+" in binary is written as:");
        decTobin(a);
    }
}
