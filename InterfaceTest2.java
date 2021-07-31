import javax.swing.event.InternalFrameEvent;

interface a{
    void test1();
}

interface b{
    void test2();
}

interface c extends a,b{
    void test3();
}

public class InterfaceTest2 implements c{
    public void test3()
    {
        System.out.print("c");
    }

    public void test1()
    {
        System.out.print("a");
    }
    
    public void test2()
    {
        System.out.print("b");
    }

    void test()
    {
        System.out.println("In the class");
    }

    public static void main(String[] args) {
       InterfaceTest2 ob=new InterfaceTest2();
       ob.test();
    }
}