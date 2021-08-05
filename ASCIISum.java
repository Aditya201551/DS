public class ASCIISum {
    
    void sum(String s)
    {
        s+=" ";
        int sum=0;
        char ch;

        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                System.out.print(sum+" ");
                sum=0;
            }
            else
                sum+=ch;
        }
    }

    public static void main(String[] args) {
        ASCIISum ob=new ASCIISum();

        ob.sum("The quick brown fox jumps over the lazy dog!");


    }
}