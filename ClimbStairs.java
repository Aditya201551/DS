import java.util.*;

public class ClimbStairs {
    public int climbStairs(int n) {
        return check(n, new HashMap<>());
    }
    
    int check(int n, HashMap<Integer, Integer> memo)
    {
        if(memo.containsKey(n))
            return memo.get(n);
        
        if(n==1 || n==0)
            return 1;
        
        if(n<0)
            return 0;
        
        memo.put(n, climbStairs(n-1)+climbStairs(n-2));
        
        return memo.get(n);
    }

    public static void main(String[] args) {
        ClimbStairs ob=new ClimbStairs();
        System.out.println(ob.climbStairs(5));   
    }
}