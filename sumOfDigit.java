// Recursive program to find the sum of digits

public class sumOfDigit {
    
    int sum(int n){
        if(n==0)
            return 0;
        return (n%10)+sum(n/10);
    }
    public static void main(String[] args)
    {
        sumOfDigit ob=new sumOfDigit();
        System.out.println(ob.sum(24974));
    }
}
