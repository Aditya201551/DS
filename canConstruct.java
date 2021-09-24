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
        if(word.length()==0)
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
    public static void main(String[] args) {
        canConstruct ob=new canConstruct();
        
        System.out.println(ob.checkWord("abcdef", new String[]{"ab","abc","cd","def","abcd"}, new HashMap<>()));
        System.out.println(ob.checkWord("skateboard", new String[] {"bo","rd","ate","t","ska","sk","boar"}, new HashMap<>()));
        System.out.println(ob.checkWord("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] { "e", "ee", "eee", "eeee", "eeeee" }, new HashMap<>()));
    }
}
