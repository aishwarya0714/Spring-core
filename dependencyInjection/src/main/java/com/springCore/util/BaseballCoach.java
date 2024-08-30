package com.springCore.util;


import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Baseball!";
    }
}
