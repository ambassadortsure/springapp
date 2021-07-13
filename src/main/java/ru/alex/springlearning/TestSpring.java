package ru.alex.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alex.springlearning.genres.ClassicalMusic;

public class TestSpring {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        /*Music music = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        classicalMusicPlayer.playMusic();*/

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        System.out.println(musicPlayer.playMusic());

        //ClassicalMusic clm1 = context.getBean("classicalMusic", ClassicalMusic.class);
        //ClassicalMusic clm2 = context.getBean("classicalMusic", ClassicalMusic.class);
        //System.out.println(clm1==clm2);

        context.close();
    }
}