package com.sofia.springboot.learnjpaandhibernate.repository;

import com.sofia.springboot.learnjpaandhibernate.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);

}
