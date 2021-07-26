import java.awt.*;

class AWTMenu extends Frame {
    MenuBar mbar;
    Menu menu0, menu1, menu2, submenu;
    MenuItem arr[]=new MenuItem[11];

    public AWTMenu() {
        setTitle("AWT Menu");
        setSize(300, 300);
        setLayout(new FlowLayout());
        setVisible(true);
        setLocationRelativeTo(null);

        mbar = new MenuBar();
        menu0 = new Menu("File");
        menu1 = new Menu("Edit");
        menu2 = new Menu("Help");

        arr[0] = new MenuItem("New");
        arr[1] = new MenuItem("Open");
        arr[2] = new MenuItem("Close");
        arr[3] = new MenuItem("------");
        arr[4] = new MenuItem("Print");
        arr[5] = new MenuItem("Edit");
        arr[6] = new MenuItem("Cut");
        arr[7] = new MenuItem("Copy");
        arr[8] = new MenuItem("Paste");
        submenu = new Menu("More");
        
        arr[9] = new MenuItem("Commands");
        arr[10] = new MenuItem("About");

        for(int i=0;i<11;i++)
        {
            if(i>=0 && i<=5)
                menu0.add(arr[i]);
            else if(i>=6 && i<9)
                menu1.add(arr[i]);
            else if(i>=9)
                submenu.add(arr[i]);
        }
        menu2.add(submenu);
        mbar.add(menu0);
        mbar.add(menu1);
        mbar.add(menu2);
        setMenuBar(mbar);
        add(new Label("Name: Samarthraj Singh"));
        add(new Label("Roll: 41"));
    }

    public static void main(String args[]) {
        new AWTMenu();
    }
}