package kodlamaIOSimulation.dataAccess.hibernate;

import kodlamaIOSimulation.dataAccess.CourseDao;
import kodlamaIOSimulation.entities.Course;

public class CourseDaoHibernate implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Saved to database via Hibernate");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Removed from database : Hibernate");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Information updated using hibernate: " + course);
		
	}

}
