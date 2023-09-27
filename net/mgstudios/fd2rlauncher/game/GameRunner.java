package net.mgstudios.fd2rlauncher.game;

import net.mgstudios.fd2rlauncher.gui.error.ErrorManager;

import java.io.File;
import java.io.IOException;

public class GameRunner {
    File ENGINE = new File("Data\\gzdoom.exe");
    File FDR = new File("Data\\Wads\\FiveNightsAtFreddys2_1.wad");
    File PK3 = new File("Data\\Wads\\FiveNightsAtFreddys2.pk3");
    File Normals = new File("Data\\Wads\\NormalsNSpeculars.pk3");
    File PLAYER_TEXTURES = new File("Data\\Wads\\PlayerTexturesAlt1.pk3");
    File IWAD = new File("Data\\Wads\\doom1.wad");
    void RunCommand(String[] command){
        try {
            Runtime.getRuntime().exec(command);
        }
        catch (IOException e){
            System.out.println("Ignored!");
        }
    }
    public boolean checkAll(){
        return ENGINE.exists() && FDR.exists() && PK3.exists() && Normals.exists() && IWAD.exists() && PLAYER_TEXTURES.exists();
    }
    public void Singleplayer(){
        if(checkAll()){
            RunCommand(new String[]{"cmd.exe","/c","start Data\\gzdoom.exe -IWAD Data\\WaDs\\DOOM1.WAD +set cl_maxdecals 2147483647 +set movebob 0.05 -FILE Data\\Wads\\* +sv_cheats 0"});
            System.exit(0);
        }
        else {
            ErrorManager.makeDialog("Some Game Files Not Found!");
        }
    }
    public void Host(String MAP_CODE, String PLAYER_NUMBER){
        if(checkAll()){
            RunCommand(new String[]{"cmd.exe","/c","start Data\\gzdoom.exe -IWAD Data\\WaDs\\DOOM1.WAD +set cl_maxdecals 2147483647 +set movebob 0.05 -FILE Data\\Wads\\* -host %s +map %s -netmode 0 +sv_cheats 0".formatted(PLAYER_NUMBER, MAP_CODE)});
            System.exit(0);
        }
        else {
            ErrorManager.makeDialog("Some Game Files Not Found!");
        }
    }
    public void Join(String IP){
        if(checkAll()){
            RunCommand(new String[]{"cmd.exe","/c","start Data\\gzdoom.exe -IWAD Data\\WaDs\\DOOM1.WAD +set cl_maxdecals 2147483647 +set movebob 0.05 -FILE Data\\WaDs\\* -join %s".formatted(IP)});
            System.exit(0);
        }
        else {
            ErrorManager.makeDialog("Some Game Files Not Found!");
        }
    }
}