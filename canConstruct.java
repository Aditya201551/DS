import java.util.*;
public class canConstruct {
    

    //simple recursion time: O((n^m)*m); space: O(m^2)
    boolean checkWord(String word, String arr[])
    {
        if(word.length()==0)
            return true;
        for(String s:arr)
        {
            if(word.indexOf(s)==0)
                if(checkWord(word.substring(s.length()), arr))
                    return true;
        }

        return false;
    }

    //memoized recursion time O(n*(m^2)); space: O(m^2)
    boolean checkWord(String word, String arr[], HashMap<String, Boolean> memo)
    {
        if(memo.containsKey(word))
            return memo.get(word);
        if(word.equals(""))
            return true;

        for(String s:arr)
        {
            if(word.indexOf(s)==0)
                if(checkWord(word.substring(s.length()), arr, memo))
                {
                    memo.put(word, true);
                    return true;
                }
        }
        memo.put(word, false);
        return false;
    }

    //tabulation
    boolean CanConstruct(String target, String arr[])
    {
        boolean result[]=new boolean[target.length()+1];
        result[0]=true;

        for(int i=0;i<=target.length();i++)
        {
            if(result[i])
                for(String word:arr)
                    if(i+word.length()<=target.length())
                        if(target.substring(i, i+word.length()).equals(word))
                            result[i+word.length()]=true;
            if(result[target.length()])
                return true;
        }

    return false;
    }
    public static void main(String[] args) {
        canConstruct ob=new canConstruct();
        
        // System.out.println(ob.checkWord("abcdef", new String[]{"ab","abc","cd","def","abcd"}, new HashMap<>()));
        // System.out.println(ob.checkWord("skateboard", new String[] {"bo","rd","ate","t","ska","sk","boar"}, new HashMap<>()));
        // System.out.println(ob.checkWord("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] { "e", "ee", "eee", "eeee", "eeeee" }, new HashMap<>()));

        System.out.println(ob.CanConstruct("abcdef", new String[]{"ab","abc","cd","def","abcd"}));
        System.out.println(ob.CanConstruct("skateboard", new String[] {"bo","rd","ate","t","ska","sk","e","boar"}));
        System.out.println(ob.CanConstruct("enterpotentpot", new String[]{"a","p","ent","enter","ot","o","t"}));
    }
}
