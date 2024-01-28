package com.example1.springcoredemo.common;


import org.springframework.stereotype.Component;

//annoation marks the class as a Spring Bean
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min";
    }
}
