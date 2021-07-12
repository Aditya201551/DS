//Program to remove extra useless spaces from the string
class RemoveSpace{

    String remove(String s)
    {
        String result="";
        char ch;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
           ch=s.charAt(i);
            if(ch==' ')
            {
                result+=ch;
                while(s.charAt(i)==' ')
                    i++;
                result+=s.charAt(i);
            }
            else
                result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        RemoveSpace ob=new RemoveSpace();
        System.out.println(ob.remove("Hello                  world, this is      Human    ! lol"));
    }
}