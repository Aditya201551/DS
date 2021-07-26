public class X implements Runnable {

    @Override
    public void run() {        
    }

    public static void main(String[] args) {
        X run = new X();
        Thread t = new Thread(run);
        t.start();
    }
    
}
