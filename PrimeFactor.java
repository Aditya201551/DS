public class PrimeFactor {
    void primeFactor(int n)
    {
        int i=2;
        if(n==1)
            return;
        while(n%i!=0)
            i++;
        System.out.print(i+" ");
        primeFactor(n/i);
    }

    public static void main(String[] args)
    {
        PrimeFactor ob=new PrimeFactor();
        ob.primeFactor(84);
    }
}
