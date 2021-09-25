import java.util.HashMap;

public class Fibonacci {

    //fibonacci using recursion
    int fib(int n)
    {
        if(n<=2)
            return 1;
        return fib(n-1)+fib(n-2);
    }

    //fibonacci with memoization
    long fib(long n, HashMap<Long, Long> memo)
    {
        if(memo.containsKey(n))
            return memo.get(n);
        if(n<=2)
            return 1;
        
        memo.put(n,(fib((n-1),memo)+fib((n-2), memo)));

        return memo.get(n);
    }

    //tabulation
    long fibo(int n)
    {
        long arr[]=new long[n+1];
        arr[0]=1;arr[1]=1;
        for(int i=2;i<n;i++)
            arr[i]=arr[i-2]+arr[i-1];
        return arr[n-1];
    }

    public static void main(String args[])
    {
        Fibonacci ob=new Fibonacci();

        System.out.println(ob.fib(9));

        System.out.println(ob.fib(999, new HashMap<Long, Long>()));

        System.out.println(ob.fibo(0));
    }
}
