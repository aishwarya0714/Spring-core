package com.springCore.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Go for Track!";
    }
}
