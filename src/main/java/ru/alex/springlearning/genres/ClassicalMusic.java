package ru.alex.springlearning.genres;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.alex.springlearning.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void  doMyInit(){
        System.out.println("Initialization");
    }

    @PreDestroy
    public  void  doMyDestroy(){
        System.out.println("Destroy");
    }


    @Override
    public String getSong() {
        return "Sonata of Moon";
    }
}