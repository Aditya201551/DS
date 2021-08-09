public class DThread {
    public static void main(String[] args) {
        t t1 = new t("Daemon Thread Boi");
        t1.setDaemon(true);
        System.out.println(t1.isDaemon()+" "+t1.getPriority());
        t1.start();
        t t2=new t("Not a daemon boi");
        t2.setDaemon(true);
        t2.start();
    }
}

class t extends Thread{
    t(String name)
    {
        super(name);
    }
    public void run()
    {
        if(isDaemon()) {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else{
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Finished: "+getName()+" "+getPriority());
    }
}