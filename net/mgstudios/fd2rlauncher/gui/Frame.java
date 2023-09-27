package net.mgstudios.fd2rlauncher.gui;

import net.mgstudios.fd2rlauncher.extra.Resource;
import net.mgstudios.fd2rlauncher.gui.menus.*;
import net.mgstudios.fd2rlauncher.gui.menus.List;
import net.mgstudios.fd2rlauncher.gui.menus.selection.ClassicNights;
import net.mgstudios.fd2rlauncher.gui.menus.selection.CustomClassicNights;
import net.mgstudios.fd2rlauncher.gui.menus.selection.CustomNights;
import net.mgstudios.fd2rlauncher.gui.menus.selection.DefaultNights;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public static JFrame frame;
    static final MainMenu mainMenu = new MainMenu();
    static final Multiplayer multiplayer = new Multiplayer();
    static final Join join = new Join();
    static final Host host = new Host();
    static final DefaultNights mapSelection = new DefaultNights();
    static final CustomNights customNights = new CustomNights();
    static final ClassicNights classicNights = new ClassicNights();
    static final CustomClassicNights ccN = new CustomClassicNights();
    public Frame(){
        super("F2DRLauncher -Five Nights at Freddy's 2 Doom Renovation Mod Launcher");
        frame = this;
        this.setSize(1024,768);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().createImage(Resource.getURL("assets/fd2rlauncher/cursor.png")), new Point(0,0), "cursor"));
        this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(Resource.getURL("assets/fd2rlauncher/freddy.png")));
        LOAD(List.MainMenu);
    }
    private static void refresh(){
        SwingUtilities.updateComponentTreeUI(frame);
    }
    public static void LOAD(List MENU){
        switch (MENU){
            case MainMenu -> {
                frame.setContentPane(mainMenu);
                refresh();
            }
            case Multiplayer -> {
                frame.setContentPane(multiplayer);
                refresh();
            }
            case Join -> {
                frame.setContentPane(join);
                refresh();
            }
            case Host -> {
                frame.setContentPane(host);
                refresh();
            }
            case DefaultNights -> {
                frame.setContentPane(mapSelection);
                refresh();
            }
            case CustomNights -> {
                frame.setContentPane(customNights);
                refresh();
            }
            case ClassicNights -> {
                frame.setContentPane(classicNights);
                refresh();
            }
            case CustomClassicNights -> {
                frame.setContentPane(ccN);
                refresh();
            }
        }
    }
}