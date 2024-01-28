package com.example1.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "TRACK WORKOUTRun a hard 5k!";
    }
}
