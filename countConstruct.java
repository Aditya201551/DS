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

    int countWays(String target, String arr[])
    {
        int result[]=new int[target.length()+1];
        result[0]=1;

        for(int i=0;i<=target.length();i++){
            if(result[i]!=0){
                for(String word:arr){
                    if(i+word.length()<=target.length()){
                        if(target.substring(i,i+word.length()).equals(word)){
                            result[i+word.length()]+=result[i];

                            //! DEBUGGER
                            // System.out.println(Arrays.toString(result));
                        }
                    }
                }
            }
        }
         
        return result[target.length()];
    }

    public static void main(String[] args) {
        countConstruct ob=new countConstruct();
        // System.out.println(ob.countWays("enterapotentpot", new String[]{"a","p","ent","enter","ot","o","t"}, new HashMap<>()));
        // System.out.println(ob.countWays("purple", new String[]{"p","purp","ur","le","purpl"}, new HashMap<>()));

        System.out.println(ob.countWays("enterapotentpot", new String[]{"a","p","ent","enter","ot","o","t"}));
        System.out.println(ob.countWays("purple", new String[]{"p","purp","ur","le","purpl"}));
    }
}
