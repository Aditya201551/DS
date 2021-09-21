import java.util.*;
public class CanSum {

    // basic iteration with O(n^2)
    boolean findSum(int arr[], int target)
    {
        for(int i=0;i<arr.length;i++)
        {
        int sum = 0;

            inner:
           for(int j=i;j<arr.length;j++)
           {
               sum+=arr[j];
               if(sum>target)
                    break inner;
                if(sum==target)
                    return true;
           }
        }

        return false;
    }

    // basic recursion with O(n^m)
    boolean findSum(int target, int arr[])
    {
        if(target==0)
            return true;
        // if(target<0)
        //     return false;

        for(int i:arr)
        {
            int tmp=target-i;
            if(tmp>=0)
                if(findSum(tmp, arr))
                    return true;
        }

        return false;
    }

    // memoized method with O(m*n)
    boolean findSum(int target, int arr[], HashMap<Integer, Boolean> memo)
    {
        if(memo.containsKey(target))
            return memo.get(target);
        if(target==0)
            return true;
        if(target<0)
            return false;

        for(int i : arr)
        {
            int tmp=target-i;
            if(tmp>=0)
                if(findSum(tmp, arr, memo)){
                    memo.put(target, true);
                    return true;
                }
        }

        memo.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        // CanSum ob=new CanSum();
        // System.out.println(ob.findSum(new int[]{50,150}, 100));
        // System.out.println(ob.findSum(21, new int[] {7,14}));
        // System.out.println(ob.findSum(300, new int[] { 7,14 }, new HashMap<>()));

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,34,5));
        ArrayList<Integer> l=list;
        l.add(100);
        System.out.println(l);
    }
}
