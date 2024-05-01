package com.swadhe.springboot.LearnJPAHibernate.course.jpa;

import com.swadhe.springboot.LearnJPAHibernate.course.Course;
import com.swadhe.springboot.LearnJPAHibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseCommandlineRunner {
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"sumita","sethy"));
        repository.insert(new Course(2,"swadheen","sethy"));
        repository.insert(new Course( 3,"banita","sethy"));
        repository.deletebyID(1);
    }
}
