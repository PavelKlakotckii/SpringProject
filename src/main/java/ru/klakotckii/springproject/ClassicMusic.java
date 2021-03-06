package ru.klakotckii.springproject;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author pavelklak
 */
@Component
public class ClassicMusic implements Music {

    List<String> classicMusic = Arrays.asList("Hungarian Rhapsody", "Das Fledermaus", "River flows in you");

    @Override
    public List<String> getSong() { return classicMusic; }
}
