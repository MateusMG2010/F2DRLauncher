package net.mgstudios.fd2rlauncher.sound;

import net.mgstudios.fd2rlauncher.extra.Resource;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Beep {
    Clip clip;
    public Beep() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(Resource.getResource("assets/fd2rlauncher/sound/select.wav")));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        }
        catch (LineUnavailableException | UnsupportedAudioFileException | IOException e){
            System.out.println("Can't Load Beep!");
        }
    }
    public void Play(){
        clip.start();
    }
    public void Stop(){
        clip.stop();
    }
}