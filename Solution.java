import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
        * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
        * class should be named Solution.
        */
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long X=sc.nextLong();
        long K=sc.nextLong();
        long arr[]=new long[N];

        for(int i=0;i<N;i++)
            arr[i]=sc.nextLong();
        Solution ob=new Solution();
        System.out.println(ob.count(arr, X, K));

        
    }

    long count(long arr[], long x, long k)
    {
        long c=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>=x)
                i+=(k-1);
            else
                c++;

        return c;
    }
}