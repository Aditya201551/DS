public class X implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        X run = new X();
        Thread t = new Thread(run);
        t.start();
    }
    
}
