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
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(Song.CLASSICAL);
        musicPlayer.playMusic(Song.ROCK);

        context.close();
    }
}
