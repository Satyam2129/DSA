package DSA_01;

public class arrayDemo {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int index =2;
        int value = 10;
        for (int i = arr.length-1; i >index ; i--) {
            arr[i] = arr[i-1];
        }
            arr[index] = value;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Test1{
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5};
        int value =2;
        for (int i = 0; i < arr1.length - 1; i++)
        {
            arr1[i] = arr1[i-1];
        }
    }
}
