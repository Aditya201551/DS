import java.util.*;
public class AllConstruct {
    ArrayList<ArrayList<String>> check(String target, String arr[]/*, HashMap<String, ArrayList<ArrayList<String>>> memo*/)
    {
        /*if(memo.containsKey(target))
            return memo.get(target);*/

        if(target.length()==0){
            ArrayList<ArrayList<String>> x=new ArrayList<>();
            x.add(new ArrayList<>());
            return x;
        }

        ArrayList<ArrayList<String>> result=new ArrayList<>();

        for(String s:arr)
        {
            if(target.indexOf(s)==0)
            {
                ArrayList<ArrayList<String>> tmp=check(target.substring(s.length()), arr/*, memo*/);
                tmp.forEach((n)->{n.add(s);});
                result.addAll(tmp);
            }
        }
        // memo.put(target, result);
        return result;
    }

    public static void main(String[] args) {
        AllConstruct ob=new AllConstruct();
        System.out.println(ob.check("purple", new String[]{"purp","p","ur","le","purpl"}/*, new HashMap<>()*/));
        System.out.println(ob.check("abcdef", new String[] { "ab", "abc", "cd", "def", "abcd", "ef", "c" }/*, new HashMap<>()*/));
        System.out.println(ob.check("aaaaaaaaz", new String[] { "a", "aa", "aaa", "aaaa", "aaaaa", "z" }/*, new HashMap<>()*/));

    }
}
