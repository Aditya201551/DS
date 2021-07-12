public class TowerOfHanoi {
    void moveTower(int n, char fromPole, char toPole, char withPole) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromPole + " to " + toPole);
        } else {
            moveTower(n - 1, fromPole, withPole, toPole);
            System.out.println("Move disk " + n + " from " + fromPole + " to " + toPole);
            moveTower(n - 1, withPole, toPole, fromPole);
        }
    }
    public static void main(String[] args) {
        
        new TowerOfHanoi().moveTower(8, 'A', 'B', 'C');
    }
}