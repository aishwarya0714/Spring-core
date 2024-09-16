package com.springCore.util;

import com.springCore.util.Coach;
import org.springframework.stereotype.Component;
//
//marks class as spring bean and make it available for dependency injection
//
@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do 15 min bowling for each day!!!";
    }
}
