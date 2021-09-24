import java.util.*;

class BestSum {

    //Time Complexity: O((n^m)*m); Space complexity: O(m*^2) 
    ArrayList<Integer> bestSum(int target, int arr[]) {
        if (target == 0)
            return new ArrayList<>();
        if (target < 0)
            return null;
        ArrayList<Integer> shortest = null;

        for (int i : arr) {
            int tmp = target - i;
            ArrayList<Integer> result = bestSum(tmp, arr);
            if (result != null) {
                result.add(i);
                if (shortest == null || result.size() < shortest.size())
                    shortest = result;
            }
        }
        return shortest;
    }

    ArrayList<Integer> bestSum(int target, int arr[], HashMap<Integer, ArrayList<Integer>> memo )
    {
        if(memo.containsKey(target))
            return memo.get(target);
        if(target==0)
            return new ArrayList<>();
        if(target<0)
            return null;

        ArrayList<Integer> shortest=null;

        for(int i:arr)
        {
            int tmp=target-i;
            ArrayList<Integer> result=bestSum(tmp, arr, memo);
            if(result!=null)
            {
                result.add(i);
                if(shortest==null||result.size()<shortest.size())
                    shortest=result;
            }
        }

        memo.put(target, shortest);
        return shortest;
    }

    public static void main(String[] args) {
        BestSum ob = new BestSum();

        //simple recursive call
        // System.out.println(ob.bestSum(7, new int[] { 5, 3, 4, 7 }));
        // System.out.println(ob.bestSum(8, new int[] { 2, 3, 5 }));
        // System.out.println(ob.bestSum(8, new int[] { 1, 4, 5 }));
        // // System.out.println(ob.bestSum(100, new int[] { 1, 2, 5, 25 }));

        //memoized recursive call
        System.out.println(ob.bestSum(7, new int[] {1, 5, 3, 4, 7 }, new HashMap<>()));
        System.out.println(ob.bestSum(8, new int[] { 2, 3, 5 }, new HashMap<>()));
        System.out.println(ob.bestSum(8, new int[] { 1, 4, 5 }, new HashMap<>()));
        System.out.println(ob.bestSum(100, new int[] {1, 25 }, new HashMap<>()));
    }
}
