public class SumOfDigitBy9 {
    boolean check(int n)
    {
        if(n==9)
            return true;
        if(n<9)
            return false;
        int sum=0;
        while(n!=0)
        {
            sum+=(n%10);
            n/=10;
        }
        return check(sum);
    }

    public static void main(String[] args)
    {
        SumOfDigitBy9 ob=new SumOfDigitBy9();
        System.out.println(ob.check(365));
        System.out.println(ob.check(36));

    }
}
