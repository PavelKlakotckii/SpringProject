package ru.klakotckii.springproject;

import java.util.Arrays;
import java.util.List;

/**
 * @author pavelklak
 */

public class RockMusic implements Music{

    List<String> rockMusic = Arrays.asList("Rocket Queen", "Sweet Child O'Mine", "Patience");

    @Override
    public String getSong() {
        return "Rocket Queen";
    }
}
