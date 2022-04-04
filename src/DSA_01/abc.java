package DSA_01;

public class abc {
    public static void main(String[] args) {
        int[] a={4,0,2,1,3};
        for (int i = 0; i < a.length; i++) {
            int temp=0;
            temp = a[i];
            a[i] = a[a[i]];
            a[a[i]]=temp;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }


}
