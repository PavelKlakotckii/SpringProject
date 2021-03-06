package ru.klakotckii.springproject;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author pavelklak
 */
@Component
public class RockMusic implements Music{

    List<String> rockMusic = Arrays.asList("Rocket Queen", "Sweet Child O'Mine", "Patience");

    @Override
    public List<String> getSong() {
        return rockMusic;
    }
}
