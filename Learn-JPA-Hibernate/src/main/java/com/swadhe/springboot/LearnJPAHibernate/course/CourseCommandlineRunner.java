package com.swadhe.springboot.LearnJPAHibernate.course;

import com.swadhe.springboot.LearnJPAHibernate.course.jdbc.CourseJdbcRepository;
import com.swadhe.springboot.LearnJPAHibernate.course.jpa.CourseJpaRepository;
import com.swadhe.springboot.LearnJPAHibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseCommandlineRunner {
//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"sumita","sethy"));
        repository.save(new Course(2,"swadheen","sethy"));
        repository.save(new Course( 3,"banita","sethy"));
        System.out.println(repository.findById(2l));
        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("swadheen"));
    }
}
