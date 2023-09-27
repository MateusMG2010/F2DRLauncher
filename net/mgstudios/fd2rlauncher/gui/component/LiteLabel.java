package net.mgstudios.fd2rlauncher.gui.component;

import javax.swing.*;
import java.awt.*;

public class LiteLabel extends JLabel {
    public LiteLabel(String TEXT){
        super(TEXT);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("consolas", Font.PLAIN, 25));
    }
}