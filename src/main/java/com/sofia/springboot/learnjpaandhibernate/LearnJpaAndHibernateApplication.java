package com.sofia.springboot.learnjpaandhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJpaAndHibernateApplication {

//	@Autowired
//	CourseJdbcRepository courseJdbcRepository;
//	@Autowired
//	CourseJpaRepository courseJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
////      Spring JDBC
////		courseJdbcRepository.insert(new Course(1,"Learn AWS Now!", "Francis Limbo"));
////		courseJdbcRepository.insert(new Course(2,"Learn Azure Now!", "Francis Limbo"));
////		courseJdbcRepository.insert(new Course(3,"Learn Kubernetes Now!", "Francis Limbo"));
////
////		courseJdbcRepository.deleteById(1);
//
//
//////		JPA -  use EntityManager
////		courseJpaRepository.insert(new Course(1,"Learn AWS JPA!", "Francis Limbo"));
////		courseJpaRepository.insert(new Course(2,"Learn Azure JPA!", "Francis Limbo"));
////		courseJpaRepository.insert(new Course(3,"Learn Kubernetes JPA!", "Francis Limbo"));
////
////		courseJpaRepository.deleteById(1);
////
////		System.out.println(courseJpaRepository.findById(2));
////		System.out.println(courseJpaRepository.findById(3));
//
////		Spring Data JPA
//		courseSpringDataJpaRepository.save(new Course(1,"Learn AWS JPA!", "Francis Limbo"));
//		courseSpringDataJpaRepository.save(new Course(2,"Learn Azure JPA!", "Francis Limbo"));
//		courseSpringDataJpaRepository.save(new Course(3,"Learn Kubernetes JPA!", "Francis Limbo"));
//
//		courseSpringDataJpaRepository.deleteById(1l);
//
//		System.out.println(courseSpringDataJpaRepository.findById(2l));
//		System.out.println(courseSpringDataJpaRepository.findById(3l));
//
//	}
}
