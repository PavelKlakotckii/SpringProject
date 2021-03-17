package ru.klakotckii.springproject;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.klakotckii.springproject")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicMusic(), jazzMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
