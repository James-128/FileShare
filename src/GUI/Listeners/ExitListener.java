package GUI.Listeners;

import GUI.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ExitListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        GUI.f.dispose();
    }
}
