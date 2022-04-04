package DSA_01;

import java.util.Arrays;

// head Recursion
public class Recursion {
    public static void print(int value){
        if(value==0){
            return;
        }
        print(value-1);
        System.out.println(value);
    }
    public static void main(String[] args) {
        print(5);
    }
}

// tail Recursion
class New{
    public static void abc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        abc(n-1);
    }

    public static void main(String[] args) {
        abc(5);
    }
        }

class Q1{
    public static void m1(int value, int power){
        if(power==0){
            return ;
        }
        else if(power==1){
            return;
        }
        m1(value,power);
        System.out.println();
    }
}

class Solution
{
    public void m1()
    {
        int[] arr = new int[]{7,5,4,3,2,1};
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                int  max1 = arr[j] - arr[i];
                if(max<max1){
                    max = max1;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.m1();
    }
}

class Solution1 {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        for ( int i =0;  i<prices.length -1 ; i++){
            for (int j = i+1; j<prices.length; j++){
                int profit = prices[j]-prices[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution2 obj = new Solution2();
        int[] arr = new int[]{2,7,11,15};
        for (int i = 0; i < arr.length; i++) {
            obj.twoSum(arr,9);
        }
    }
}

class Solution3 {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == original ){
                original *= 2 ;
            }
        }
        return original;
    }

    public static void main(String[] args) {
        Solution3 obj1 = new Solution3();
        int [] arr1 = new int[]{8,19,4,2,15,3};
        System.out.println(obj1.findFinalValue(arr1,2));
    }
}

class Solution4 {
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
}

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 */

class Solution5 {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for (;i<nums.length;i++){
            if(nums[i] == target){
                System.out.println(i);
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Solution5 obj = new Solution5();
        int arr[]= new int[]{1,3,5,6};
        obj.searchInsert(arr,5);
    }
}

class sol6{
    void m1(int[]arr,int original){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==original){
                original *= 2;
                i=-1;
            }
        }
        System.out.println(original);
    }

    public static void main(String[] args) {
        sol6 obj = new sol6();
        int [] arr1 = new int[]{8,19,4,2,15,3};
        obj.m1(arr1,2);
    }
}

