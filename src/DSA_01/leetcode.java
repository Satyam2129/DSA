package DSA_01;

import java.util.Scanner;

public class leetcode {
    static class Solution {
        public boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }
            int reversed_int=0;
            int num=x;
            while(num>0){
                int d=num%10;
                num/=10;
                reversed_int=reversed_int*10+d;
            }
            if(x==reversed_int){
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            Solution obj = new Solution();
            System.out.println(obj.isPalindrome(121));
        }
    }
}

class hack12{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
//        int k=sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]= new int[size];
        int j=size;
        for(int i=0;i<size;i++){
            --j;
            arr1[i]=arr[j];
        }
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}