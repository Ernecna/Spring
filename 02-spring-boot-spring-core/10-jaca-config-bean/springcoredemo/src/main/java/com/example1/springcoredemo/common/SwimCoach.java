package com.example1.springcoredemo.common;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as a wam up";
    }
}
