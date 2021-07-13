package ru.alex.springlearning;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.alex.springlearning.genres.ClassicalMusic;
import ru.alex.springlearning.genres.RapMusic;
import ru.alex.springlearning.genres.RockMusic;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList(){
        List<Music> musicList = new ArrayList<>();
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        musicList.add(rapMusic());
        return  musicList;
    }

/*    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic(), classicalMusic());
    }*/
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
