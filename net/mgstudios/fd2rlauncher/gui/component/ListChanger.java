package net.mgstudios.fd2rlauncher.gui.component;

import net.mgstudios.fd2rlauncher.gui.Frame;
import net.mgstudios.fd2rlauncher.gui.menus.List;
import net.mgstudios.fd2rlauncher.sound.SoundManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListChanger extends LiteButton {
    public static int[] BACK_BOUNDS = {35, 575, 85, 35};
    public static int[] NEXT_BOUNDS = {130, 575, 85, 35};
    public ListChanger(String TEXT, List TO_LOAD, int[] BOUNDS){
        super(TEXT, TEXT);
        this.setBounds(BOUNDS[0],BOUNDS[1],BOUNDS[2],BOUNDS[3]);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SoundManager.SelectBeep();
                Frame.LOAD(TO_LOAD);
            }
        });
    }
}