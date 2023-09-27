package net.mgstudios.fd2rlauncher.gui.menus.selection;

import net.mgstudios.fd2rlauncher.gui.component.ListChanger;
import net.mgstudios.fd2rlauncher.gui.component.LitePanel;
import net.mgstudios.fd2rlauncher.gui.component.MapButton;
import net.mgstudios.fd2rlauncher.gui.menus.List;

public class ClassicNights extends LitePanel {
    MapButton NIGHT_1 = new MapButton("Night 1: Classic", "> Night 1: Classic", "e3m1");
    MapButton NIGHT_2 = new MapButton("Night 2: Classic", "> Night 2: Classic", "e3m2");
    MapButton NIGHT_3 = new MapButton("Night 3: Classic", "> Night 3: Classic", "e3m3");
    MapButton NIGHT_4 = new MapButton("Night 4: Classic", "> Night 4: Classic", "e3m4");
    MapButton NIGHT_5 = new MapButton("Night 5: Classic", "> Night 5: Classic", "e3m5");
    MapButton NIGHT_6 = new MapButton("Night 6: Classic", "> Night 6: Classic", "e3m6");
    ListChanger BACK = new ListChanger("<<", List.CustomNights, ListChanger.BACK_BOUNDS);
    ListChanger NEXT = new ListChanger(">>", List.CustomClassicNights, ListChanger.NEXT_BOUNDS);
    public ClassicNights(){
        super(true);
        NIGHT_1.setBounds(35,180,345,35);
        NIGHT_2.setBounds(35,240,345,35);
        NIGHT_3.setBounds(35,300,345,35);
        NIGHT_4.setBounds(35,360,345,35);
        NIGHT_5.setBounds(35,420,345,35);
        NIGHT_6.setBounds(35,480,345,35);

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