import java.util.Scanner;

public class String_sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
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
                {
                    if(s1[i].compareTo(s1[j])>0)
                    {
                        String temp = s1[i];
                        s1[i]=s1[j];
                        s1[j]=temp;
                    }
                }

            }
        }
        for (int i = 0; i < s1.length; i++)
        {
            System.out.print(s1[i]+" ");
        }
    }
}
