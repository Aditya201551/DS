public class ThreadTable {
    public static void main(String[] args) {
        Table t1=new Table();
        t1.start();
        if(t1.isAlive())
            System.out.println("Still running!");
    }
}

class Table extends Thread{

    public void run()
    {
        System.out.println("MULTIPLICATION");

        for(int i=1;i<=10;i++)
            System.out.println("3X"+i+"= "+(i*3));
    }
}