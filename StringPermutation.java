import java.util.*;
public class StringPermutation{
    void getPermutation(String s, String permutation, List<String> list, HashMap<String, String> memo)
    {
        if(memo.containsKey(s))
            list.add(memo.get(s));
        if(s.length()==0)
        {
            list.add(permutation);
            return;
        }
        for(int i=0;i<s.length();i++){
            String permutationHere=permutation+s.charAt(i);
            memo.put(s, permutationHere);
            getPermutation(s.substring(0, i)+s.substring(i+1), permutationHere, list, memo);
        }
    }

    public static void main(String[] args) {
        StringPermutation ob=new StringPermutation();
        List<String> list=new ArrayList<>();
        ob.getPermutation("The quick", "", list, new HashMap<>());
        System.out.println(list);
    }
}