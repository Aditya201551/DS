public class sync {
    public static void main(String[] args) {
        first f=new first();
        new second("Java", f);
        new second("Is", f);
        new second("OOP", f);

    }    
}

class first{
    public void display(String msg)
    {
        System.out.print("["+msg);

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.print("]");
    }
}

class second extends Thread{
    String msg;
    first f;
    second(String msg, first f)
    {
        this.msg=msg;
        this.f=f;
        start();
    }

    public void run()
    {
        synchronized(f){
            f.display(msg);
        }
    }
}