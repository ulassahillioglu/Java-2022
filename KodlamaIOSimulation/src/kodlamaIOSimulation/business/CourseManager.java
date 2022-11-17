package kodlamaIOSimulation.business;

import java.util.List;

import kodlamaIOSimulation.core.logging.Logger;
import kodlamaIOSimulation.dataAccess.CourseDao;
import kodlamaIOSimulation.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager() {

	}

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Price cannot be lower than 0: "+ course.getCourseName());
			
		}
		for (Course newcourse : courses) {
			if (newcourse.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Course name cannot repeat itself: "+ course.getCourseName());
			}
		}
		courseDao.add(course);
		courses.add(course);
		
		for(Logger logger: loggers) {
			logger.log(course.getCourseName());
		}
	}
}
