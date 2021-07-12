import java.awt.*;
public class layout extends Frame{
    layout(){
        super("Layout title");
        setBackground(Color.green);
        setLayout(new BorderLayout());
        /* set size of the window */
        setSize(500,500);
        add(new Button("OS"), BorderLayout.NORTH);
        add(new Button("BCA"), BorderLayout.CENTER);
        add(new Button("JAVA"), BorderLayout.SOUTH);
        add(new Button("DBMS"), BorderLayout.EAST);
        add(new Button("PYTHON"), BorderLayout.WEST);
        setVisible(true);
    }

    public Insets getInsets(){
        return new Insets(50,100,100,100);
    }

    public static void main(String[] args) {
        new layout();
    }
}