import java.util.Scanner;

public class Frequency_sort {
    public static void main(String[] args) {
        String s = "neeraj";
        int[] arr =new int[26];
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                arr[i]++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

class new_sort{
    public static void main(String[] args) {
        int[] arr = {78,65,11,19,24,5};
        for (int i = 0; i < arr.length-1; i++)
        {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

class Selective_Sort{
    public static void main(String[] args) {
        int[] a = {10,5,6,2,8,12};
        int index=0;
        for (int i = 0; i < a.length; i++) {
            int temp=a[i];
            for (int j = i+1; j < a.length-1; j++) {
                if(temp>a[j]){
                    temp=a[j];
                    index=j;

                    int x = a[i];
                    a[i]=a[index];
                    a[index]=x;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                if(a[i]>a[j+1])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }


        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }
}


class subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s = sc.nextInt();
        int[] a= new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        int left=0,right=0,sum=0;
        for (; left < n; left++) {
            sum = sum + a[left];
            if(sum>s){
                sum = sum-a[right];
                right++;
            }
            if(sum==s){
                System.out.print((++right)+" "+(++left));
            }
        }

    }
}


