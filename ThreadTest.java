import java.util.*;
public class ThreadTest {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            Th1 t1 = new Th1();
            Th2 t2 = new Th2();
            Thread ob2 = new Thread(t2, "Non Input Thread");
            t1.start();
            ob2.start();
        }
    }
}


class Th1 extends Thread{
    Th1()
    {
        super("Input Thread");
    }
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Thread "+currentThread().getId()+": "+currentThread().getName()+" is running");
            String s=sc.nextLine();
            System.out.println("Hello "+s+" this is "+currentThread().getId());
            sc.close();
        } catch(Exception e)
        {
            System.out.println("Exception caught "+e);
        }
    }
}

class Th2 implements Runnable{
    public void run()
    {
        try{
            System.out.println(
                    "Thread " + Thread.currentThread().getId() + ": " + Thread.currentThread().getName() + " is running");
        } catch(Exception e)
        {
            System.out.println("Exception caught "+e);
        }
    }
}