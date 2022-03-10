import java.util.Scanner;

public class String_sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "the big brown fox jumps over the lazy little dog";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = i+1; j < s1.length; j++)
            {
                if(s1[i].length()>s1[j].length())
                {
                    String x=s1[i];
                    s1[i]=s1[j];
                    s1[j]=x;
                }
                if(s1[i].length()==s1[j].length())
                    if(s1[i].compareTo(s1[j])>0)
                    {
                        String temp = s1[i];
                        s1[i]=s1[j];
                        s1[j]=temp;
                    }
            }
        }
        String search = "the";
        int start=0;
        int end = s1.length-1;
        int mid = s1.length/2;
        if(s1[mid].compareTo(search)==0){
            System.out.println("yes");
        }
        for (int i = 0; i < s1.length; i++) {
            if(s1[mid].compareTo(search)>0){
                start=mid+1;
                mid = (end-start)/2;
            }
            if(s1[mid].compareTo(search)<0){
                end=mid-1;
                mid=(end-start)/2;
            }
        }

        for (int i = 0; i < s1.length; i++)
        {
            System.out.print(s1[i]+" ");
        }
    }
}
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            int str=sc.nextInt();
            String s = sc.next();
            s = s.substring(0,str-1);
            for(int j=0;i<s.length()-1;j++){
                if(s.charAt(j)==s.charAt(j+1)){
                    count++;
                }
                else{
                    count=1;
                }
            }
            System.out.println(count);
        }

    }
}
