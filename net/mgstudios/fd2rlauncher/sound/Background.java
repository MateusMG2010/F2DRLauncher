package net.mgstudios.fd2rlauncher.sound;

import net.mgstudios.fd2rlauncher.extra.Resource;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Background {
    Clip clip;
    public Background() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(Resource.getResource("assets/fd2rlauncher/sound/background.wav")));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        }
        catch (LineUnavailableException | UnsupportedAudioFileException | IOException e){
            System.out.println("Ignored!");
        }
    }
    public void Play(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
}