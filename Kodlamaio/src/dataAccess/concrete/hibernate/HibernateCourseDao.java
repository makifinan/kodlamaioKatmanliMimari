package dataAccess.concrete.hibernate;

import dataAccess.Abstract.CourseDao;
import entities.concrete.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi" + course);
		
	}

}
