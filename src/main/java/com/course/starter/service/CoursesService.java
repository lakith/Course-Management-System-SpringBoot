package com.course.starter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.course.starter.data.CourseData;
import com.course.starter.model.Course;

@Service
public class CoursesService {

	CourseData cd = new CourseData();
	public List<Course> getAllCourses()
	{
				
		return cd.returnCourseData();
	}
	
	public Course getCourseData (int id) {
		return cd.getCourseOneData(id);
	} 
}
