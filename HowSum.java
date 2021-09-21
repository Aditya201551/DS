import java.util.*;
public class HowSum {
    
    ArrayList<Integer> findSum(int target, int arr[])
    {
        if(target==0)
            return new ArrayList<>();
        if(target<0)
            return null;
        for(int i:arr)
        {
            int tmp=target-i;
            ArrayList<Integer> result=findSum(tmp, arr);
            if(result!=null)
            {
                ArrayList<Integer> list=result;
                list.add(i);
                return list;
            }
        }
        return null;
    }

    ArrayList<Integer> findSum(int target, int[] arr, HashMap<Integer, ArrayList<Integer>> memo)
    {
        if(memo.containsKey(target))
            return memo.get(target);
        if(target==0)
            return new ArrayList<>();
        if(target<0)
            return null;

        for(int i:arr)
        {
            int tmp=target-i;
            ArrayList<Integer> result=findSum(tmp, arr, memo);
            if(result!=null)
            {
                result.add(i);
                memo.put(target, result);
                return memo.get(target);   
            }
        }
        memo.put(target, null);
        return null;
    }

    public static void main(String[] args) {
        HowSum ob=new HowSum();
        // System.out.println(ob.findSum(300, new int[]{7,14}));
        System.out.println(ob.findSum(100, new int[]{90,96,4}, new HashMap<>()));

        //! Side Note on .equals() function
        // ArrayList<Integer> a,b;
        // a=new ArrayList<>();b=new ArrayList<>();
        // a.add(10);a.add(20);
        // b.add(10);b.add(20);
        // System.out.println(b.equals(a));
        // HashMap<Integer, Integer> x=new HashMap<>();
        // HashMap<Integer, Integer> y=new HashMap<>();
        // x.put(1,20);
        // y.put(1,20);
        // x.put(2,50);
        // y.put(2, 40);
        // System.out.println(x.equals(y));
    }
}
