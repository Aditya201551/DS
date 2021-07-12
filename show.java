import java.awt.*;
public class show {
    public static void main(String[] args) {
        Button b;
        Frame f=new Frame("This is my button frame.");
        f.setSize(400, 300);
        b=new Button("Click Me");
        f.add(b);
        f.setLocation(200, 200);
        f.setVisible(true);
    }
}
