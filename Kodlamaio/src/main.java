import java.util.ArrayList;
import java.util.List;

import business.concrete.CategoryManager;
import business.concrete.CourseManager;
import core.logging.Abstract.Logger;
import core.logging.concrete.DatabaseLogger;
import core.logging.concrete.FileLogger;
import dataAccess.concrete.hibernate.HibernateCategoryDao;
import dataAccess.concrete.hibernate.HibernateCourseDao;
import entities.concrete.Category;
import entities.concrete.Course;

public class main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers  = {new DatabaseLogger(), new FileLogger()};
		
		Course course1 = new Course (1,"Java",1,100,50);
		Course course2 = new Course (2,"C#/Angular",1,100,50);
		Course course3 = new Course (3,"Javascript",1,10,50);
		Course course4 = new Course (4,"Senior .NET",1,10,50);
		Course course5 = new Course (5,"Java/React",1,100,50);
		Course courseControl = new Course(6,"Java",1,100,50);
		
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
		courses.add(course5);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(courseControl);
		
		
		Category category1 = new Category(1,"Kodlama");
		Category category2 = new Category(2,"Veri Tabanı");
		
		List<Category> categories = new ArrayList<Category>();
		categories.add(category1);
		categories.add(category2);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categories);
		Category categoryControl = new Category(3,"Kodlama");
		categoryManager.add(categoryControl);
		
		
		
		
		
		
	
		
		
	}

}
