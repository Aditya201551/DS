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
    public static void main(String[] args) {
        CustomException ob=new CustomException();
        ob.test();
    }
}

class adityaException extends Exception{
    adityaException(String s)
    {
        super(s);
    }
}