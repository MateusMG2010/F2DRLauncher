package net.mgstudios.fd2rlauncher.gui.menus;

import net.mgstudios.fd2rlauncher.gui.Frame;
import net.mgstudios.fd2rlauncher.game.GameRunner;
import net.mgstudios.fd2rlauncher.gui.component.LiteButton;
import net.mgstudios.fd2rlauncher.gui.component.LitePanel;
import net.mgstudios.fd2rlauncher.gui.component.Return;
import net.mgstudios.fd2rlauncher.sound.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;

public class Host extends LitePanel {
    final JSpinner PLAYER_SPINNER = new JSpinner(new SpinnerNumberModel(2, 2, 8, 1));
    final JFormattedTextField PLAYER_SPINNER_EDITOR = ((JSpinner.DefaultEditor) PLAYER_SPINNER.getEditor()).getTextField();
    final LiteButton start = new LiteButton("Host", "> Host");
    static final LiteButton NIGHTS = new LiteButton("Night 1", "> Night 1");
    Properties properties = System.getProperties();
    final Return return_btn = new Return(List.Multiplayer);
    public Host(){
        NIGHTS.setBounds(35,445,385,35);
        NIGHTS.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Frame.LOAD(List.DefaultNights);
            }
        });

        PLAYER_SPINNER.setBackground(Color.BLACK);
        PLAYER_SPINNER.setForeground(Color.WHITE);
        PLAYER_SPINNER.setBounds(35,385,170,35);

        PLAYER_SPINNER_EDITOR.setBackground(Color.BLACK);
        PLAYER_SPINNER_EDITOR.setForeground(Color.WHITE);
        PLAYER_SPINNER_EDITOR.setFont(new Font(Font.SERIF,Font.PLAIN,32));
        PLAYER_SPINNER_EDITOR.setEditable(false);

        start.setBounds(35,515,385,35);
        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SoundManager.SelectBeep();
                new GameRunner().Host(properties.getProperty("map_code"), PLAYER_SPINNER.getValue().toString());
            }
        });
        this.add(NIGHTS);
        this.add(PLAYER_SPINNER);
        this.add(start);
        this.add(return_btn);
    }
    public static void setText(String DEFAULT_TEXT, String SELECTED_TEXT){
        NIGHTS.setText(DEFAULT_TEXT);
        NIGHTS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                NIGHTS.setText(SELECTED_TEXT);
            }
            @Override
            public void mouseExited(MouseEvent e){
                NIGHTS.setText(DEFAULT_TEXT);
            }
        });
    }
}