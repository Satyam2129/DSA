package DSA_01;

public class Q2_searchRec
{

public static boolean searchEle(int arr[] , int searchvalue)
{
    int n = arr.length;
    if(n==0){
        return false;
    }
    if(arr[0]==searchvalue){
        return true;
    }
    int arr1[] = new int[n-1];
    for (int i = 1; i < n; i++) {
        arr1[i-1] = arr[i];
    }
    return searchEle(arr1,searchvalue);
}

    public static void main(String[] args) {
    int arr2[] = {1,2,3,4,5};
        System.out.println(searchEle(arr2,4));
    }

}
