package net.mgstudios.fd2rlauncher.gui.menus.selection;

import net.mgstudios.fd2rlauncher.gui.component.ListChanger;
import net.mgstudios.fd2rlauncher.gui.component.LitePanel;
import net.mgstudios.fd2rlauncher.gui.component.MapButton;
import net.mgstudios.fd2rlauncher.gui.menus.List;

public class CustomNights extends LitePanel {
    ListChanger BACK = new ListChanger("<<", List.DefaultNights, ListChanger.BACK_BOUNDS);
    ListChanger NEXT = new ListChanger(">>", List.ClassicNights, ListChanger.NEXT_BOUNDS);
    MapButton E2M1 = new MapButton("Freddy's Circus", "> Freddy's Circus", "e2m1");
    MapButton E2M2 = new MapButton("New And Shiny", "> New And Shiny", "e2m2");
    MapButton E2M3 = new MapButton("4/20", "> 4/20", "e2m3");
    MapButton E2M4 = new MapButton("Foxy Foxy", "> Foxy Foxy", "e2m4");
    MapButton E2M5 = new MapButton("Golden Freddy", "> Golden Freddy", "e2m5");
    public CustomNights(){
        super(true);
        E2M1.setBounds(35,180,335,35);
        E2M2.setBounds(35,240, 335, 35);
        E2M3.setBounds(35,300,335,35);
        E2M4.setBounds(35,360,335,35);
        E2M5.setBounds(35,420,335,35);

        this.add(E2M1);
        this.add(E2M2);
        this.add(E2M3);
        this.add(E2M4);
        this.add(E2M5);

        this.add(BACK);
        this.add(NEXT);
    }
}