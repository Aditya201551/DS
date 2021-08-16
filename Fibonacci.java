public class Fibonacci {
    int fib(int n)
    {
        if(n==0 || n==1)
            return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String args[])
    {
        Fibonacci ob=new Fibonacci();
        System.out.println(ob.fib(10));
    }
}
