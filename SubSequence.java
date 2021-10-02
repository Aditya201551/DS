public class SubSequence {
    
    int check(String s1, String s2)
    {
        boolean arr[]=new boolean[s2.length()];
        int c=0;
        outer:
        for(int i=0;i<s1.length();i++)
        {
            inner:
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j) && !arr[j])
                {
                    c++;
                    for(int k=0;k<=j;k++)
                        arr[k]=true;
                    continue outer;
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {
        SubSequence ob=new SubSequence();
        System.out.println(ob.check("iq", "ksjfb"));
    }
}
