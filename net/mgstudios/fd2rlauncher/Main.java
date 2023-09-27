package net.mgstudios.fd2rlauncher;

import net.mgstudios.fd2rlauncher.gui.Frame;
import net.mgstudios.fd2rlauncher.sound.SoundManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("===F2DRLauncher===");
        System.out.println("-Launcher By @MateusMG2010");
        System.out.println("-Game By @MrBrownie");
        new Frame();
        SoundManager.Background();
    }
}