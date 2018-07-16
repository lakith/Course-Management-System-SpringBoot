package com.course.starter.data;

import java.util.ArrayList;
import java.util.List;

import com.course.starter.model.Course;

public class CourseData {

	public List<Course> returnCourseData() {
		List<Course> courses = new ArrayList<Course>();
		
		courses.add(new Course(0,"java","Consists java 8 basics"));
		courses.add(new Course(1,"nodeJs","Consists node js basics"));
		courses.add(new Course(2,"PHP","Consists PHP basics"));
		
		return courses;
	}
	
}
