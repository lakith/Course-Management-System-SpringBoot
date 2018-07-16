package com.course.starter.controller;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.starter.data.CourseData;
import com.course.starter.model.Course;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> getCourses(){
		CourseData c1 = new CourseData();
		return c1.returnCourseData();
	}
	
}
