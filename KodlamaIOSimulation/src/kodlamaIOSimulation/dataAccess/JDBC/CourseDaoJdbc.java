package kodlamaIOSimulation.dataAccess.JDBC;


import kodlamaIOSimulation.dataAccess.CourseDao;
import kodlamaIOSimulation.entities.Course;

public class CourseDaoJdbc implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Saved to database via JDBC");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Removed from database : JDBC");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Information updated using JDBC: " + course);
		
	}

	
	}


