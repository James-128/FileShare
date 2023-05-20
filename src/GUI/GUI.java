package GUI;

import javax.swing.*;


public class GUI {
    public static JFrame f;

    private GUI() { /* blocks instantiation */ }

    public static void initWindow() {
        // create a frame
        f = new JFrame("Menu demo");

        GUIMenu t = new GUIMenu();

        // add menu bar to frame
        f.setJMenuBar(t.menubar);

        // setting options
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
