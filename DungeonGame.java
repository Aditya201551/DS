import java.util.*;
public class DungeonGame {
    int result[][];
    //tabulation
 public int calculateMinimumHP(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        result=new int[r][c];
        
        for(int i=r-1;i>=0;--i)
        {
            for(int j=c-1;j>=0;--j)
            {
                if(i==r-1 && j==c-1)
                    result[i][j]=Math.min(0,arr[i][j]);
                else if(i==r-1)
                    result[i][j]=Math.min(0,arr[i][j]+result[i][j+1]);
                else if(j==c-1)
                    result[i][j]=Math.min(0, arr[i][j]+result[i+1][j]);
                else
                    result[i][j]=Math.min(0, arr[i][j]+Math.max(result[i+1][j],result[i][j+1]));
            }
        }
        return Math.abs(result[0][0])+1;
    }
    //memoization
    int travel(int i, int j, int arr[][], HashMap<String, Integer> memo)
    {
        if(i>=arr.length || j>=arr[0].length)
            return Integer.MAX_VALUE;
        String key=i+","+j;
        
        if(memo.containsKey(key))
            return memo.get(key);
        
        int health=Math.min(travel(i+1, j, arr, memo), travel(i, j+1, arr, memo));
        
        if(health==Integer.MAX_VALUE)
            health=1;
        
        int result=0;
        
        if(health-arr[i][j]>0)
            result=health-arr[i][j];
        else
            result=1;
        
        memo.put(key, result);
        
        return result;
    }
    
    public static void main(String[] args) {
        DungeonGame ob=new DungeonGame();
        
        System.out.println(ob.calculateMinimumHP(new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}})+"\n");

        for(int i=0;i<ob.result.length;i++){
            for(int j=0;j<ob.result[0].length;j++)
                System.out.print(ob.result[i][j]+"\t");
            System.out.println();
        }

        System.out.println("\n"+ob.travel(0, 0, new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}}, new HashMap<>()));
    }
}