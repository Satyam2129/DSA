package Sorting;

class method{
    public static void quicksort(int arr[],int start, int end){
        if(start<end){
            int pivot = partition(arr,start,end);
            quicksort(arr,start,pivot-1);
            quicksort(arr,pivot+1,end);
        }
    }
    public static int partition(int arr[],int p,int q){
        int pivot=q;
        int i = p-1;
        for (int j = p; j <=q ; j++) {
            if(arr[j]<=arr[pivot]){
                i++;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return i;
    }

    public static void display(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {34,4,5,23,77,89,83,21,101};
        quicksort(arr,0,arr.length-1);
        display(arr);
    }
}

public class Quick_sort {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
