import javax.swing.*;

public class GUIMenu {
    public JMenuBar mb;
    GUIMenu () {

        // create a menubar
        mb = new JMenuBar();

        // create a menu
        JMenu x = new JMenu("Menu");

        // create menuitems
        JMenuItem m1 = new JMenuItem("MenuItem1");
        JMenuItem m2 = new JMenuItem("MenuItem2");
        JMenuItem m3 = new JMenuItem("MenuItem3");

        // add menu items to menu
        x.add(m1);
        x.add(m2);
        x.add(m3);

        // add menu to menu bar
        mb.add(x);
    }
}
