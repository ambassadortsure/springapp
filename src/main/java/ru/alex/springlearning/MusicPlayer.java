package ru.alex.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.alex.springlearning.genres.ClassicalMusic;
import ru.alex.springlearning.genres.Genre;
import ru.alex.springlearning.genres.RockMusic;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

/*
    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
*/

    private List<Music> musicList;
    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }
    public String playMusic(){
        return "Playing: " + musicList.get(new Random().nextInt(musicList.size())).getSong();
    }
}