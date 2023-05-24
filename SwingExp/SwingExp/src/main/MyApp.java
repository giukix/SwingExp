package main;
import view.MainFrame;

import javax.swing.*;

public class MyApp {
    public static void main(String[] args) {
        // runs in AWT thread
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
