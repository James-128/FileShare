package GUI;

import javax.swing.*;

public class GUIMenu {
    public JMenuBar menubar;
    GUIMenu () {
        menubar = new JMenuBar();

        // adding menus to menu bar
        menubar.add(fileMenu());
        menubar.add(networkingMenu());
    }

    JMenu networkingMenu () {
        JMenu networking = new JMenu("Network");

        // creating items
        JMenuItem mDevices = new JMenuItem("Devices");
        JMenuItem mConn = new JMenuItem("Connect");
        JMenuItem mDisconn = new JMenuItem("Disconnect");

        //adding items
        networking.add(mDevices);
        networking.add(mConn);
        networking.add(mDisconn);

        return networking;
    }

    JMenu fileMenu() {
        JMenu file = new JMenu("File");

        // creating items
        JMenuItem exit = new JMenuItem("Exit");

        // adding items
        file.add(exit);

        return file;
    }
}
