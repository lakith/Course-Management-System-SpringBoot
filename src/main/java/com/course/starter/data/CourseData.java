package com.course.starter.data;

import java.util.ArrayList;
import java.util.List;

import com.course.starter.model.Course;

public class CourseData {

	List<Course> courses = new ArrayList<Course>();
	
	public CourseData() {
		courses.add(new Course(0,"java","Consists java 8 basics"));
		courses.add(new Course(1,"nodeJs","Consists node js basics"));
		courses.add(new Course(2,"PHP","Consists PHP basics"));
	}
	
	public List<Course> returnCourseData() {
		return courses;
	}
	
	public Course getCourseOneData(int id) {
		Course c1 = (id == 0)? courses.get(0): (id == 1)? courses.get(1):courses.get(2); 
		return c1;
	}
	
}
