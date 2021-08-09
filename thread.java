public class thread extends Thread{
    thread(String name, ThreadGroup tg)
    {
        super(tg, name);
    }

    public void run()
    {
        System.out.println(currentThread().getName()+" finished");
    }

    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("Parent group");
        thread t1=new thread("Thread One", tg);
        t1.setPriority(7);
        System.out.println("Starting: "+t1.getName()+" with priority: "+t1.getPriority());
        thread t2 = new thread("Thread Two", tg);
        t2.setPriority(3);
        System.out.println("Starting: "+t2.getName()+" with priority: "+t2.getPriority());
        System.out.println("Thread Group: "+t1.getThreadGroup()+" with: "+t1.getPriority());
        System.out.println("Thread Group: "+t2.getThreadGroup()+" with: "+t2.getPriority());
        t1.start();
        t2.start();
    }
}