package net.mgstudios.fd2rlauncher.gui.menus.selection;

import net.mgstudios.fd2rlauncher.gui.component.ListChanger;
import net.mgstudios.fd2rlauncher.gui.component.LitePanel;
import net.mgstudios.fd2rlauncher.gui.component.MapButton;
import net.mgstudios.fd2rlauncher.gui.menus.List;

public class CustomClassicNights extends LitePanel {
    MapButton E4M1 = new MapButton("Freddy Circus: CL", "> Freddy Circus: CL", "e4m1");
    MapButton E4M2 = new MapButton("New And Shiny: CL", "> New And Shiny: CL", "e4m2");
    MapButton E4M3 = new MapButton("4/20: CL", "> 4/20: CL", "e4m3");
    MapButton E4M4 = new MapButton("Foxy Foxy: CL", "> Foxy Foxy: CL", "e4m4");
    MapButton E4M5 = new MapButton("Golden Freddy: CL", "> Golden Freddy: CL", "e4m5");
    ListChanger BACK = new ListChanger("<<", List.CustomNights, ListChanger.BACK_BOUNDS);
    ListChanger NEXT = new ListChanger(">>", List.DefaultNights, ListChanger.NEXT_BOUNDS);
    public CustomClassicNights(){
        super(true);
        E4M1.setBounds(35,180,385,35);
        E4M2.setBounds(35,240,385,35);
        E4M3.setBounds(35,300,385,35);
        E4M4.setBounds(35,360,385,35);
        E4M5.setBounds(35,420,385,35);

        this.add(E4M1);
        this.add(E4M2);
        this.add(E4M3);
        this.add(E4M4);
        this.add(E4M5);

        this.add(BACK);
        this.add(NEXT);
    }
}