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
/*
Take input two integer arrays sorted in increasing order, and size of arrays. Merge them into a single array sorted in increasing order.

The final sorted array should not be returned by the function, but instead be printed as space separated.
 */
class hack2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        int total =size+size1;
        int arr2[] = new int[total];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int j=0;
        for(int i=size;i<total;i++){
            arr2[i]=arr1[j];
            j++;
            if(j>size1) break;
        }
        Arrays.sort(arr2);
        for(int i=0;i<total;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

/*
Given head of a singly linked list, group all nodes with odd indices together followed by nodes with even indices,and return reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.
 */

class hack3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<size;i++){
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Input Format

The first line contains an integer n, the number of elements in the array.

Each of the next n lines contains an integer, the data values of the elements in the array.

Next line contains an integer k, the elements to be rotated.

Constraints

1 <= nums.length <= 105

-1000 <= nums[i] <= 1000

0 <= k <= 105

Output Format

Print the rotated array elements space separated.

Sample Input 0

7
1 2 3 4 5 6 7
3
Sample Output 0

5 6 7 1 2 3 4
Explanation 0

Input: nums = [1,2,3,4,5,6,7], k = 3

Output: [5,6,7,1,2,3,4]

Explanation:

rotate 1 steps to the right: [7,1,2,3,4,5,6]

rotate 2 steps to the right: [6,7,1,2,3,4,5]

rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

class hack4{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]= new int[size];
        int j=size-1;
        for(int i=0;i<size;i++){
            arr1[i]=arr[j];
            j--;
        }
        int k=sc.nextInt();
        int a = k-1;
        int arr2[] = new int[size];
        for (int i=0;i<=k-1;i++){
            arr2[i]=arr1[a];
            a--;
        }
        int b = 0;
        for(int i=k;i<size;i++){
            arr2[i]=arr[b];
            b++;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

/*
Given a integer x, return x with its digits reversed.

Input Format

Take input a number n.

Constraints

-200 <= n <= 200

Output Format

Print the reversed number

Sample Input 0

-102
Sample Output 0

-201
Explanation 0

Number : 210

Reversed Number : 12
 */

class hack5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = Math.abs(n);
        int x=0;
        if(n<0){
            System.out.print("-");
        }
        while(y!=0){
            x = y%10;
            y = y/10;
            System.out.print(x);
        }
    }
}