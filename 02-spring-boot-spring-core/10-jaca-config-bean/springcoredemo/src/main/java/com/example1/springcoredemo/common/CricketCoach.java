package com.example1.springcoredemo.common;



import org.springframework.stereotype.Component;

//annoation marks the class as a Spring Bean
@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }




    @Override
    public String getDailyWorkout() {
        return "Practice fas bowling AADASDDASDSAforRRr 15 min";
    }

}
