import java.time.zone.ZoneRulesException;

public class CustomException {
    void test()
    {
        try{
            throw new adityaException("This is a custom exception");
            // throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    int test2()
    {
        try{
            int x=20/0;
            return x;
        }
        catch(ZoneRulesException e)
        {
            System.out.println("gotcha");
        }
        finally{
            return 10;
        }
    }

    public static void main(String[] args) {
        CustomException ob=new CustomException();
        System.out.println(ob.test2());
        ob.test();
        adityaException ob2=new adityaException("Hello"); // exception class can also be used as a normal class for normal tasks
        ob2.exceptionShow();
    }
}

class adityaException extends Exception{
    adityaException(String s)
    {
        super(s);
    }

    void exceptionShow(){
        System.out.println("This is been shown from the custom exception class");
    }
}