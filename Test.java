class T1 extends Thread{
   public void run()
   {
       for(int i=0;i<300;i++)
        System.out.println("Hello Thread One");
   }
}

class T2 implements Runnable{
    public void run()
    {
        for(int i=0;i<300;i++)
            System.out.println("Hello Thread Two");
    }
}

public class Test {
    public static void main(String[] args) {
        T1 t1=new T1();
        T2 t2=new T2();
        Thread ob=new Thread(t2, "Runner one");
        t1.start();
        ob.start();
    }
}