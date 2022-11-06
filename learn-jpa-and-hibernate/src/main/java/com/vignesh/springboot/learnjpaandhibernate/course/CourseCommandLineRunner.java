package com.vignesh.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vignesh.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.vignesh.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.vignesh.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository repository; //spring jdbc
	
//	@Autowired
//	private CourseJpaRepository repository;  //spring jpa
	
	@Autowired
	private CourseSpringDataJpaRepository repository;  //spring data jpa
	
	@Override
	public void run(String... args) throws Exception {
		
		//for spring jdbc, spring jpa
//		repository.insert(new Course(1, "Learn AWS now", "in28minutes"));
//		repository.insert(new Course(2, "Learn Azure", "in28minutes"));
//		repository.insert(new Course(3, "Learn DevOps now", "in28minutes"));
//		
//		repository.deleteById(1);
//		
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(3));
		
		
		//spring data jpa
		repository.save(new Course(1, "Learn AWS now", "in28minutes"));
		repository.save(new Course(2, "Learn Azure", "in28minutes"));
		repository.save(new Course(3, "Learn DevOps now", "in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor(""));

	}
	
	

}
