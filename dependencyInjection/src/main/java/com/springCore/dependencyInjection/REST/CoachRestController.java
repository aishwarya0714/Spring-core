package com.springCore.dependencyInjection.REST;

import com.springCore.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachRestController {

//    inject interface here and give it name
    private Coach myCoach;

//    create constructor of class - constructor injection
//    when your working with multiple components use Qualifier t access them
//    @Autowired
//    public CoachRestController(@Qualifier("cricketCoach") Coach theCoach){
//        myCoach=theCoach;
//    }
//

//    when you want to use @primary

    @Autowired
    public CoachRestController(Coach theCoach){
        myCoach=theCoach;
    }


    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
