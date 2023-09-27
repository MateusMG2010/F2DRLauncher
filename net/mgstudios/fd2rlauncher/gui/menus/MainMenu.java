package net.mgstudios.fd2rlauncher.gui.menus;

import net.mgstudios.fd2rlauncher.game.GameRunner;
import net.mgstudios.fd2rlauncher.gui.Frame;
import net.mgstudios.fd2rlauncher.gui.component.LiteButton;
import net.mgstudios.fd2rlauncher.gui.component.LitePanel;
import net.mgstudios.fd2rlauncher.sound.SoundManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu extends LitePanel {
    final LiteButton Singleplayer = new LiteButton("Singleplayer","> Singleplayer");
    final LiteButton Multiplayer = new LiteButton("Multiplayer","> Multiplayer");
    public MainMenu(){
        Singleplayer.setBounds(35,385,295,35);
        Singleplayer.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SoundManager.SelectBeep();
                Singleplayer.reset();
                new GameRunner().Singleplayer();
            }
        });
        Multiplayer.setBounds(35,445,295,35);
        Multiplayer.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SoundManager.SelectBeep();
                Multiplayer.reset();
                Frame.LOAD(List.Multiplayer);
            }
        });
        this.add(Singleplayer);
        this.add(Multiplayer);
    }
}