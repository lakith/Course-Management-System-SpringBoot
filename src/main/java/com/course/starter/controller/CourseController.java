package com.course.starter.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.starter.data.CourseData;
import com.course.starter.model.Course;
import com.course.starter.service.CoursesService;

@RestController
public class CourseController {

	@Autowired
	CoursesService cs;
	
	@RequestMapping("/courses")
	public List<Course> getCourses(){
		return cs.getAllCourses();
	}
	
	@RequestMapping("/courses/{id}")
	public Course getOneCourses(@PathVariable int id){
		return cs.getCourseData(id);		
	}
	
}
