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

    // tabulation: time: O((m^2)*n); space: O(m^2)
    ArrayList<Integer> howSum(int target, int numbers[])
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<=target;i++)
            list.add(null);

            list.set(0, new ArrayList<>());
            
            for(int i=0;i<=target;i++)
            {
                if(list.get(i)!=null)
                {
                    for(int j:numbers)
                        if(i+j<list.size())
                        {
                            if(list.get(i+j)==null||list.get(i).size()<list.get(i+j).size())// to get the best shortest sum from the array
                            {
                                list.set(i+j, (ArrayList)list.get(i).clone());
                                list.get(i+j).add(j);
                            }
                        }
                }
                if(list.get(target)!=null)
                    return list.get(target);
            }

        return null;
        
    }

    public static void main(String[] args) {
        HowSum ob=new HowSum();
        // System.out.println(ob.findSum(300, new int[]{7,14}));
        // System.out.println(ob.findSum(100, new int[]{90,96,4}, new HashMap<>()));
        for(int i=0;i<=20;i++)
        System.out.println(ob.howSum(i, new int[]{3,4,5}));

        System.out.println(ob.howSum(100, new int[]{1,3,25}));

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
