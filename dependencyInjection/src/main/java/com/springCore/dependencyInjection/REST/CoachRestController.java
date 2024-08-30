package com.springCore.dependencyInjection.REST;

import com.springCore.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachRestController {

//    inject interface here and give it name
    private Coach myCoach;

//    create constructor of class - constructor injection
//    @Autowired
//    public CoachRestController(Coach theCoach){
//        myCoach=theCoach;
//    }

//    use setter injection
    @Autowired
    public void anyName(Coach theCoach){
        myCoach=theCoach;
    }


//    expose endpoint for daily workout
    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
