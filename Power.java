public class Power {
    
    int pow(int m, int n)
    {
        if(n==0)
            return 1;
        return m*pow(m, --n);
    }
    public static void main(String[] args)
    {
        Power ob=new Power();
        System.out.println(ob.pow(2,15));
    }
}
