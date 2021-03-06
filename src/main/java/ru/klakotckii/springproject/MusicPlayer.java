package ru.klakotckii.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author pavelklak
 */
@Component
public class MusicPlayer {
    private ClassicMusic music1;
    private RockMusic music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") ClassicMusic music1,
                       @Qualifier("classicalMusic") RockMusic music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Song musicStyle) {
        if (musicStyle == Song.CLASSICAL) {
            return music1.getSong().get(new Random().nextInt(3));
        } else {
            return music2.getSong().get(new Random().nextInt(3));
        }
    }
}
