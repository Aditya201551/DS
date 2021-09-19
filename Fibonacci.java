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

    public static void main(String args[])
    {
        Fibonacci ob=new Fibonacci();

        System.out.println(ob.fib(4));

        System.out.println(ob.fib(999, new HashMap<Long, Long>()));
    }
}
