package com.springCore.dependencyInjection;

import org.springframework.stereotype.Component;
//
//marks class as spring bean and make it available for dependency injection
//
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do 15 min bowling for each day!!!";
    }
}
