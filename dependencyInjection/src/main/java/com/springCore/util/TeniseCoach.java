package com.springCore.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class TeniseCoach implements Coach{

    public TeniseCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Tennise!!";
    }
}
