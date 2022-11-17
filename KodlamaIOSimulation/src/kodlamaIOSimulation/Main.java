package kodlamaIOSimulation;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOSimulation.business.InstructorManager;
import kodlamaIOSimulation.business.CategoryManager;
import kodlamaIOSimulation.business.CourseManager;
import kodlamaIOSimulation.core.logging.DatabaseLogger;
import kodlamaIOSimulation.core.logging.FileLogger;
import kodlamaIOSimulation.core.logging.Logger;
import kodlamaIOSimulation.core.logging.MailLogger;
import kodlamaIOSimulation.dataAccess.JDBC.CourseDaoJdbc;
import kodlamaIOSimulation.dataAccess.hibernate.CategoryDaoHibernate;
import kodlamaIOSimulation.dataAccess.hibernate.InstructorDaoHibernate;
import kodlamaIOSimulation.entities.Category;
import kodlamaIOSimulation.entities.Course;
import kodlamaIOSimulation.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Kodlama.io. The Number 1 Online Platform to start your Coding Education");
		System.out.println("---------------------");
		
		Logger[] loggers = new Logger[] {new DatabaseLogger(), new MailLogger(), new FileLogger()};
		
		
		
		
		Instructor instructor1 = new Instructor("Engin","Demiroğ");
		Instructor instructor2 = new Instructor("Salih","Demiroğ");
		
		List<Instructor> instructors = new ArrayList<Instructor>();
		instructors.add(instructor1);
		instructors.add(instructor2);
		
		InstructorManager instructorManager = new InstructorManager(new InstructorDaoHibernate(),loggers,instructors);
		
		instructorManager.add(instructor1);
		
		System.out.println("------------------------");
		instructorManager.add(instructor2);
				
		Course course1 = new Course(1,"Java 2022 Bootcamp",1000,"Beginner->Intermediate",(instructor1.getFirstName()+instructor1.getLastName()));
		
		Course course2 = new Course(2,"Python 2022 Study",500,"Beginner->Intermediate",(instructor2.getFirstName()+instructor2.getLastName()));
		
		Course course3 = new Course();
		course3.setId(3);
		course3.setCourseName(".Net 2022 Bootcamp");
		course3.setPrice(5000);
		course3.setDescription("Intermediate->Senior");
		course3.setInstructorName((instructor1.getFirstName()+instructor1.getLastName()));
		
		Course course4 = new Course(4,".NET 2022 Bootcamp",0,"Intermediate->Senior",(instructor2.getFirstName()+instructor2.getLastName()));
		
		List<Course> courses = new ArrayList<Course>();
		
		List<Course> newCourses = new ArrayList<Course>();
		newCourses.add(course1);
		newCourses.add(course2);
		newCourses.add(course3);
		newCourses.add(course4);
		CourseManager courseManager = new CourseManager(new CourseDaoJdbc(),loggers,courses);
		
		
		System.out.println("---------------------");
		for(Course course : newCourses) {
			courseManager.add(course);
			System.out.println("---------------------");
		}
		
		System.out.println("---------------------");
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("JAVA");
		Category category2 = new Category(2,"C#");
		
		Category category3 = new Category(3,"Python");
		
		List<Category> newCategories = new ArrayList<Category>();
		newCategories.add(category1);
		newCategories.add(category2);
		newCategories.add(category3);
		
		List<Category> categories = new ArrayList<Category>();
		CategoryManager categoryManager = new CategoryManager(new CategoryDaoHibernate(),loggers, categories);
		
		for(Category category : newCategories) {
			categoryManager.add(category);
			System.out.println("---------------------");
		}
		System.out.println("---------------------");
	}
	

}
