public class DThread {
    public static void main(String[] args) {
        t t1 = new t("Daemon Thread Boi");
        t1.setDaemon(true);
        System.out.println(t1.isDaemon()+" "+t1.getPriority());
        t1.start();
        new t("Not a daemon boi").start();
    }
}

class t extends Thread{
    t(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Finished: "+currentThread().getName()+" "+currentThread().getPriority());
    }
}