package dataAccess.concrete.jdbc;

import dataAccess.Abstract.CourseDao;
import entities.concrete.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi." + course);
		
	}

}
