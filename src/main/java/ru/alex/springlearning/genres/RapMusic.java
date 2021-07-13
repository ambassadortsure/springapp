package ru.alex.springlearning.genres;

import ru.alex.springlearning.Music;

public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Turn down for what";
    }
}
