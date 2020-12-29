package ru.testspring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Classical Music";
    }
}
