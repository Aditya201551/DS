import java.util.*;
public class pattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n=sc.nextInt();
        int x=1;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=Math.pow(2,i);j++)
            {
                if(x>=10)
                    x=1;
                System.out.print(x++);
            }

            System.out.println();
        }

        sc.close();
    }
}
