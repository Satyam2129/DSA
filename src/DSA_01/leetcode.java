package DSA_01;

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
