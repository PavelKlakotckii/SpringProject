package ru.klakotckii.springproject;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

/**
 * @author pavelklak
 */

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

//    private Music music1;
//    private Music music2;
    private List<Music> musicList;


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
//        this.music1 = music1;
//        this.music2 = music2;
    }

    public String playMusic() {
        Random r = new Random();
        return "Playing: " + musicList.get(r.nextInt(2)).getSong();
    }
}
