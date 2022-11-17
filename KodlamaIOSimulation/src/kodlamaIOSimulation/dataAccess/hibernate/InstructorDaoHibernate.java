package kodlamaIOSimulation.dataAccess.hibernate;

import kodlamaIOSimulation.dataAccess.InstructorDao;
import kodlamaIOSimulation.entities.Instructor;

public class InstructorDaoHibernate implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Saved to database via Hibernate");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Removed from database : Hibernate");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Information updated using Hibernate: " + instructor);
		
	}
	
}
