import java.util.*;
import java.util.Map.Entry;
public class FreqCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        sc.close();
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);
        }

        for(Entry<Character, Integer> entry: map.entrySet())
            System.out.println(entry.getKey()+": "+entry.getValue());

    }
}
