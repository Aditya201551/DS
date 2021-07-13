public class LongestSubString {
    int check(String s)
    {

        int max=0;
        String tmp="";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(tmp.contains(String.valueOf(ch)))
            {
                if(tmp.length()>max)
                    max=tmp.length();

                tmp="";
            }
            tmp+=ch;
        }
        return max;
    }
    public static void main(String[] args) {
        LongestSubString ob = new LongestSubString();
        System.out.println(ob.check("pwwkew"));
    }
}
