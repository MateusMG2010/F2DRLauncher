package net.mgstudios.fd2rlauncher.gui.component;

import net.mgstudios.fd2rlauncher.gui.Frame;
import net.mgstudios.fd2rlauncher.gui.menus.Host;
import net.mgstudios.fd2rlauncher.gui.menus.List;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;

public class MapButton extends LiteButton {
    Properties properties = System.getProperties();
    public MapButton(String DEFAULT_TEXT, String SELECTED_TEXT, String MAP_CODE){
        super(DEFAULT_TEXT, SELECTED_TEXT);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Host.setText(DEFAULT_TEXT, SELECTED_TEXT);
                properties.setProperty("map_code", MAP_CODE);
                MapButton.super.reset();
                Frame.LOAD(List.Host);
                System.out.println("===MAP-DEBUG===");
                System.out.printf("Selected: %s\n", MAP_CODE);
            }
        });
    }
}