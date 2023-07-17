package com.sofia.springboot.learnjpaandhibernate.controller;

import com.sofia.springboot.learnjpaandhibernate.model.Course;
import com.sofia.springboot.learnjpaandhibernate.repository.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerController implements CommandLineRunner {
    @Autowired
    CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        //		Spring Data JPA
		courseSpringDataJpaRepository.save(new Course(1,"Learn AWS JPA!", "Francis Limbo"));
		courseSpringDataJpaRepository.save(new Course(2,"Learn Azure JPA!", "Francis Limbo"));
		courseSpringDataJpaRepository.save(new Course(3,"Learn Kubernetes JPA!", "Francis Limbo"));

		courseSpringDataJpaRepository.deleteById(1l);

		System.out.println(courseSpringDataJpaRepository.findById(2l));
		System.out.println(courseSpringDataJpaRepository.findById(3l));
        System.out.println(courseSpringDataJpaRepository.findAll());
        System.out.println(courseSpringDataJpaRepository.findByAuthor("Francis Limbo"));
        System.out.println(courseSpringDataJpaRepository.findByAuthor(""));
        System.out.println(courseSpringDataJpaRepository.findByName("Learn Azure JPA!"));
    }
}
