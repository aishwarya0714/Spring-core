package com.springCore.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TeniseCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Tennise!!";
    }
}
