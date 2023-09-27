package net.mgstudios.fd2rlauncher.gui.component;

import net.mgstudios.fd2rlauncher.extra.Resource;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Random;

public class LitePanel extends JLabel {
    final LiteLabel TITLE = new LiteLabel("<html><body>Five<br>Nights<br>At<br>Freddy's<br>2<br>Doom<br>Renovation<br>Mod</body></html>");
    final LiteLabel GAME_VERSION = new LiteLabel("Version: 3.0.0");
    public LitePanel(){
        TITLE.setBounds(35,-45,205,450);
        TITLE.setFont(new Font("Consolas",Font.PLAIN, 35));
        this.add(TITLE);
        GAME_VERSION.setBounds(35,685,250,30);
        GAME_VERSION.setFont(new Font("Consolas", Font.PLAIN, 30));
        this.add(GAME_VERSION);
        this.setLayout(null);
        new imageThread().start();
    }
    void setImage(URL url){
        ImageIcon icon = new ImageIcon(url);
        this.setIcon(icon);
    }
    class imageThread extends Thread implements Runnable {
        Random random = new Random();
        @Override
        public void run() {
            try {
                while (true){
                    defaultImage();
                    sleep(sortTime());
                    if(canShow()){
                        setImage(Resource.getURL("assets/fd2rlauncher/background/BACKGROUND_2.png"));
                        sleep(135);
                    }
                    defaultImage();
                    sleep(sortTime());
                    if(canShow()){
                        setImage(Resource.getURL("assets/fd2rlauncher/background/BACKGROUND_3.png"));
                        sleep(135);
                    }
                    defaultImage();
                    sleep(sortTime());
                    if(canShow()){
                        setImage(Resource.getURL("assets/fd2rlauncher/background/BACKGROUND_4.png"));
                        sleep(135);
                    }
                }
            }
            catch (InterruptedException e){
                System.out.println("Ignored!");
            }
        }
        void defaultImage() throws InterruptedException {
            setImage(Resource.getURL("assets/fd2rlauncher/background/BACKGROUND_1.png"));
            sleep(200);
        }
        int sortTime(){
            return random.nextInt(2000,5500);
        }
        boolean canShow() {
            return random.nextInt(100) < 45;
        }
    }
    public LitePanel(boolean isMapSelection){
        if(isMapSelection){
            LiteLabel SELECTION_TITLE = new LiteLabel("Select An Episode:");
            SELECTION_TITLE.setBounds(35,35,350,40);
            SELECTION_TITLE.setFont(new Font("Consolas",Font.PLAIN, 35));
            this.setLayout(null);
            this.add(SELECTION_TITLE);
            new imageThread().start();
        }
    }
}