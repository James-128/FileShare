import javax.swing.*;
public class GUI {
    GUI () {
        JFrame f=new JFrame();//creating instance of JFrame

        // create a frame
        f = new JFrame("Menu demo");

        GUIMenu t = new GUIMenu();

        // add menubar to frame
        f.setJMenuBar(t.mb);

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
