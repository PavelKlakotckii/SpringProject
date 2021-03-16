package ru.klakotckii.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pavelklak
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicMusic classicalMusic1 = context.getBean("classicMusic", ClassicMusic.class);
        ClassicMusic classicalMusic2 = context.getBean("classicMusic", ClassicMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}
