package DSA_01;

import java.util.Scanner;

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
            arr[i] = sc.nextInt();//arr[0] = arr[arr[0]]
        }
        for (; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
//        System.out.println();
        try {

            for (int j = 0; j < res.length; j++) {
                if(arr[j]>=arr.length){
                    throw new ArrayIndexOutOfBoundsException("element value greater than size of array");
                }else{
                    res[j] = arr[arr[j]];
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
