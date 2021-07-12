public class Sum {
    
    int sum(int n)
    {
        if(n==0)
        return 0;

        return n+sum(--n);
    }

    public static void main(String[] args)
    {
        Sum s = new Sum();
        System.out.println(s.sum(4));
    }
}
