public class Child extends parent{
    void test()
    {
        System.out.println("Child "+n);
    }

    public static void main(String[] args) {
        parent ob=new Child();
        ob.test();
    }
}

class parent{
    int n=10;
    void test()
    {
        System.out.println("parent "+n);

    }
}