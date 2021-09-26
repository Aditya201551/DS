import java.util.HashMap;

public class GridTravel {
    
    long travel(long m, long n)
    {
        if(m==1||n==1)
            return 1;
        if(m==0||n==0)
            return 0;

        return travel(m-1, n)+travel(m, n-1);
    }

    long travel(long m, long n, HashMap<String, Long> memo)
    {
        String key=m+","+n;
        String key2=n+","+m;

        if(memo.containsKey(key)||memo.containsKey(key2))
            return memo.get(key)==null?memo.get(key2):memo.get(key);
        if(m==0||n==0)
            return 0;
        if(m==1||n==1)
            return 1;

        memo.put(key,(travel(m-1, n,memo)+travel(m, n-1,memo)));

        return memo.get(key);
    }

    long traveler(int m, int n)
    {
        long grid[][]=new long[m+1][n+1];
        grid[1][1]=1;
        for(int i=0;i<=m;i++)
            for(int j=0;j<=n;j++)
            {
                if(j!=n)
                    grid[i][j+1]+=grid[i][j];
                if(i!=m)
                    grid[i+1][j]+=grid[i][j];
            }
        //     System.out.println();
        //     for(int i=0;i<=m;i++){
        //     for(int j=0;j<=n;j++)
        //         System.out.print(grid[i][j]+" ");
        //     System.out.println();
        // }
        // System.out.println();

        return grid[m][n];
    }

    public static void main(String[] args) {
        GridTravel ob=new GridTravel();
        
        // System.out.println(ob.travel(100,100));
        System.out.println(ob.traveler(18, 18));
        System.out.println(ob.travel(10, 10, new HashMap<String, Long>()));

        // int a=15,b=7;
        // String s=a+","+b;
        // System.out.println(s);
    }
}
