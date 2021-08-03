public class TestException {
    
    void test() throws ArithmeticException
    {
        System.out.println("Helooooo human");
        System.out.println("Executio path: "+System.getProperty("user.dir"));
        // throw new ArithmeticException("cannot divide by zerooooo");
    }

    public static void main(String[] args) {
        TestException ob=new TestException();
        try{
            ob.test();
        }
        catch(Exception e)
        {
            System.out.println("\n"+e.toString()+" handled");
        }
    }
}
