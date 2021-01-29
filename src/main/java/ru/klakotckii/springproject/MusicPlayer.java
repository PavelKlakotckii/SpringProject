package ru.klakotckii.springproject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pavelklak
 */
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private int volume;
    private String name;
    private String duration;

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void playMusic() {
        for (Music music: musicList){
            System.out.println("Playing: " + music.getSong() + "Duration: " + getDuration());
        }
    }
}
