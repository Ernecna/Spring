package com.example1.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//annoation marks the class as a Spring Bean
@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    //define init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStarupStuff()"+getClass().getSimpleName());
    }
    @PreDestroy
    public void doMyFinishStuff(){
        System.out.println("In doMyFinishStuff()"+getClass().getSimpleName());
    }



    //define destroy method



    @Override
    public String getDailyWorkout() {
        return "Practice fas bowling AADASDDASDSAforRRr 15 min";
    }

}
