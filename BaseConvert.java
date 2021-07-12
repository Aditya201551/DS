public class BaseConvert {
    
    void convert(int n, int base)
    {
        int rem=n%base;
        if(n==0)
            return;
        convert(n/base, base);
        if(rem<10)
            System.out.print(rem);
        else
            System.out.print((char)((rem-10)+'A'));
    }

    public static void main(String[] args)
    {
        BaseConvert ob=new BaseConvert();
        ob.convert(2, 2);
    }
}
