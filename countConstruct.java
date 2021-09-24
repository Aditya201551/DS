import java.util.*;

public class countConstruct {

    int countWays(String s, String arr[], HashMap<String, Integer> memo)
    {
        if(memo.containsKey(s))
            return memo.get(s);
        if(s.equals(""))
            return 1;
        int totalWays=0;
        for(String i:arr)
        {
            if(s.indexOf(i)==0)
            {
                int count=countWays(s.substring(i.length()), arr, memo);
                totalWays+=count;
            }
        }

        memo.put(s, totalWays);
        return totalWays;
    }

    public static void main(String[] args) {
        countConstruct ob=new countConstruct();
        System.out.println(ob.countWays("enterapotentpot", new String[]{"a","p","ent","enter","ot","o","t"}, new HashMap<>()));
        System.out.println(ob.countWays("purple", new String[]{"p","purp","ur","le","purpl"}, new HashMap<>()));
    }
}
