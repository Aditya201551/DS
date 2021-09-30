import java.util.*;
public class AllConstruct {
    ArrayList<ArrayList<String>> check(String target, String arr[], HashMap<String, ArrayList<ArrayList<String>>> memo)
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
                ArrayList<ArrayList<String>> tmp=check(target.substring(s.length()), arr, memo);
                tmp.forEach((n)->{n.add(s);});
                result.addAll(tmp);
            }
        }
        // memo.put(target, result);
        return result;
    }

    ArrayList<ArrayList<String>> check(String target, String arr[])
    {
        ArrayList<ArrayList<ArrayList<String>>> result=new ArrayList<>(Collections.nCopies(target.length() + 1, null));

        for (int i = 0; i <= target.length(); i++) {
            result.set(i, new ArrayList<>());
    }
        result.get(0).add(new ArrayList<>());

        for (int i = 0; i <= target.length(); i++) {
            for (String word : arr) {
                if (target.substring(i).indexOf(word) == 0) {
                    List<List<String>> newCombinations = new ArrayList<>();

          for (List<String> subArray : result.get(i)) {
            List<String> subArrayTemp = new ArrayList<>(subArray);
            subArrayTemp.add(word);
            newCombinations.add(subArrayTemp);
          }

          for (List<String> subArray : newCombinations) {
            result.get(i + word.length()).add(new ArrayList<>(subArray));
          }

        }
      }
    }

    return result.get(target.length());
  }

    public static void main(String[] args) {
        AllConstruct ob=new AllConstruct();
        // System.out.println(ob.check("purple", new String[]{"purp","p","ur","le","purpl"}, new HashMap<>()));
        // System.out.println(ob.check("abcdef", new String[] { "ab", "abc", "cd", "def", "abcd", "ef", "c" }, new HashMap<>()));
        // System.out.println(ob.check("aaaaaaaaz", new String[] { "a", "aa", "aaa", "aaaa", "aaaaa", "z" }, new HashMap<>()));

        System.out.println(ob.check("abcdef", new String[] { "ab", "abc", "cd", "def", "abcd", "ef", "c" }));
        System.out.println(ob.check("purple", new String[]{"purp","p","ur","le","purpl"}));
        // System.out.println(ob.check("aaaaaaaaz", new String[] { "a", "aa", "aaa", "aaaa", "aaaaa", }));

    }
}
