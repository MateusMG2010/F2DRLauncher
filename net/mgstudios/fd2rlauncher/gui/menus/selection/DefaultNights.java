package net.mgstudios.fd2rlauncher.gui.menus.selection;

import net.mgstudios.fd2rlauncher.gui.component.ListChanger;
import net.mgstudios.fd2rlauncher.gui.component.LitePanel;
import net.mgstudios.fd2rlauncher.gui.component.MapButton;
import net.mgstudios.fd2rlauncher.gui.menus.List;


public class DefaultNights extends LitePanel {
    MapButton NIGHT_1 = new MapButton("Night 1","> Night 1", "e1m1");
    MapButton NIGHT_2 = new MapButton("Night 2","> Night 2", "e1m2");
    MapButton NIGHT_3 = new MapButton("Night 3","> Night 3", "e1m3");
    MapButton NIGHT_4 = new MapButton("Night 4","> Night 4", "e1m4");
    MapButton NIGHT_5 = new MapButton("Night 5","> Night 5", "e1m5");
    MapButton NIGHT_6 = new MapButton("Night 6","> Night 6", "e1m6");
    ListChanger BACK = new ListChanger("<<", List.CustomClassicNights, ListChanger.BACK_BOUNDS);
    ListChanger NEXT = new ListChanger(">>", List.CustomNights, ListChanger.NEXT_BOUNDS);
    public DefaultNights(){
        super(true);
        NIGHT_1.setBounds(35,180,250,35);
        NIGHT_2.setBounds(35,240,250,35);
        NIGHT_3.setBounds(35,300,250,35);
        NIGHT_4.setBounds(35,360,250,35);
        NIGHT_5.setBounds(35,420,250,35);
        NIGHT_6.setBounds(35,480,250,35);
        this.add(NIGHT_1);
        this.add(NIGHT_2);
        this.add(NIGHT_3);
        this.add(NIGHT_4);
        this.add(NIGHT_5);
        this.add(NIGHT_6);
        this.add(BACK);
        this.add(NEXT);
    }
}