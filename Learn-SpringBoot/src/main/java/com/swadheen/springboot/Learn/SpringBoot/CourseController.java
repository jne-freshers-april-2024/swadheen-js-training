package com.swadheen.springboot.Learn.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/course")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
            new Course(1,"swadheen","sethy"),
            new Course(2,"Suman","sethy"),
            new Course(3,"sumit","sethy")
        );
    }
}
