package ru.alex.springlearning.genres;

import org.springframework.stereotype.Component;
import ru.alex.springlearning.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Californication";
    }
}