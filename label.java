import java.awt.*;
public class label extends Frame{
    label(String s){
        super(s);
        setLayout(new GridLayout(5,1));
        setBackground(Color.blue);
        Font f=new Font("Times New Roman", Font.ITALIC, 20);
        setFont((f));
        Label a=new Label("Aditya Raj");
        Label b = new Label("Asansol Engineering College",Label.CENTER);
        Label c = new Label("60");
        add(a);
        add(b);
        add(c);
        setSize(300,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new label("Title");
    }
}
