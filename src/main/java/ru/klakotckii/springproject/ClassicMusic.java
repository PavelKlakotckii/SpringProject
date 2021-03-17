package ru.klakotckii.springproject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author pavelklak
 */

public class ClassicMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    // Для Prototype бинов не вызывается destroy-метод!
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
