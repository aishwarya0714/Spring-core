package com.springCore.util;

import org.springframework.stereotype.Component;

@Component
public class TeniseCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Tennise!!";
    }
}
