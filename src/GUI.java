import javax.swing.*;
public class GUI {
    GUI () {
        // create a frame
        JFrame f = new JFrame("Menu demo");

        GUIMenu t = new GUIMenu();

        // add menubar to frame
        f.setJMenuBar(t.menubar);

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
