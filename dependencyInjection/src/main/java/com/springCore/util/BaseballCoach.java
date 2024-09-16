package com.springCore.util;


import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Baseball!";
    }

    public BaseballCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
}
