package net.mgstudios.fd2rlauncher.gui.component;

import net.mgstudios.fd2rlauncher.sound.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LiteButton extends JLabel {
    String TEXT;
    public LiteButton(String DEFAULT_TEXT, String SELECTED_TEXT){
        super(DEFAULT_TEXT);
        TEXT = DEFAULT_TEXT;
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Consolas",Font.PLAIN, 35));
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                SoundManager.Beep();
                LiteButton.super.setText(SELECTED_TEXT);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                LiteButton.super.setText(DEFAULT_TEXT);
            }
        });
    }
    public void reset(){
        this.setText(TEXT);
    }
}