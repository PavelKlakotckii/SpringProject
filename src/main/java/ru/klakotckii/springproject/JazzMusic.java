package ru.klakotckii.springproject;

import org.springframework.stereotype.Component;

/**
 * @author pavelklak
 */
@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Lui Armstrong";
    }
}
