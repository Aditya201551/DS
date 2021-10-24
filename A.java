class B{
    void say(){
        System.out.println("B");
    }
}

public class A extends B{
    void say(){
        System.out.println("A");
    }
    public static void main(String[] args){
        B b=new A();
        b.say();

    }
}
