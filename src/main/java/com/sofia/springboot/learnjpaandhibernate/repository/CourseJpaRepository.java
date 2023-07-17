package com.sofia.springboot.learnjpaandhibernate.repository;

import com.sofia.springboot.learnjpaandhibernate.model.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//Transactional if you want to use JPA
@Repository
@Transactional
public class CourseJpaRepository {

    //PersistenceContext is better annotation for EntityManager
    // instead of Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
