import java.awt.*;
public class btn_test {
    
}
class btn extends Frame {
    btn(String s)
    {
        super(s);
        setSize(300, 200);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        for(int i=1;i<=10;i++)
            add(new Button("Button"+i));
        setVisible(true);
    }
    public static void main(String[] args) {
        new btn("Button Frame");
    }
}