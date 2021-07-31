interface one{
    public static final int p=10;
    int q=50;
    void show();
}

interface two{
    int p=100;
}

class Test implements one, two{
    int p=500;
    public void show()
    {
        System.out.println("P="+this.p);
        System.out.println("P="+one.p);
        System.out.println("Q="+q);
    }
}

public class InterfaceTest{
    public static void main(String[] args) {
        Test ob=new Test();
        ob.show();
        System.out.println("P="+two.p);
    }
}