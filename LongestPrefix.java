class LongestPrefix{
    String check(String arr[])
    {
        if(arr==null)
            return "";
        if(arr.length==1)
            return arr[0];
        String str=arr[0];

        while(str.length()>0)
        {
            boolean check=true;
            inner:
            for(String s:arr)
                if(s.indexOf(str)!=0)
                {
                    check=false;
                    break inner;
                }
            if(!check)
                str=str.substring(0, str.length()-1);
            else
                return str;
            
        }
        return "";
    }

    public static void main(String[] args) {
        LongestPrefix ob=new LongestPrefix();

        System.out.println(ob.check(new String[]{"flower","flow", "flight"}));
        System.out.println(ob.check(new String[]{"dog", "racecar","car"}));
    }
}