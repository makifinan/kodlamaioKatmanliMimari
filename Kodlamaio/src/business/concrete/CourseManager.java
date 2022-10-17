package business.concrete;

import java.util.List;

import business.Abstract.CourseService;
import core.logging.Abstract.Logger;
import dataAccess.Abstract.CourseDao;
import entities.concrete.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		super();
		this.courseDao = courseDao;
		this.loggers=loggers;
		this.courses=courses;
	}



	@Override
	public void add(Course course) throws Exception {
		
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan düşük olamaz.");
		}
		
		for(Course course_ :  courses) {
			if(course_.getName() == course.getName()) {
				throw new Exception("Kursu ismi daha önce kullanıldı.");
			}
			else {
				courseDao.add(course);
		
				for(Logger logger : loggers) {
				logger.log(course.getName());
				}
			}
		}
		
		
		
	}
	
}
