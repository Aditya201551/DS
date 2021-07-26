import java.util.*;
class findPrime{

    boolean isPrime(int n)
    {
        for(int i=2;i<=(int)(n/2);i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        findPrime ob=new findPrime();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Nth term: ");
        int n=sc.nextInt();

        for(int i=2;i<=n;i++)
            if(ob.isPrime(i))
                System.out.print(i+" ");
            
    }
}