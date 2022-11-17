package kodlamaIOSimulation.dataAccess.JDBC;

import kodlamaIOSimulation.dataAccess.InstructorDao;
import kodlamaIOSimulation.entities.Instructor;

public class InstructorDaoJdbc implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Saved to database via JDBC");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Removed from database : JDBC");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Information Updated using JDBC: " + instructor);
		
	}

}
