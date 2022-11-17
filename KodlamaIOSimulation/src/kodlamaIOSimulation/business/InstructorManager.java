package kodlamaIOSimulation.business;

import java.util.List;

import kodlamaIOSimulation.core.logging.Logger;
import kodlamaIOSimulation.dataAccess.InstructorDao;
import kodlamaIOSimulation.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	private List<Instructor> instructors;
	
	public InstructorManager() {
		
	}

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers, List<Instructor> instructors) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		this.instructors = instructors;
	}
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		instructors.add(instructor);
		
		for(Logger logger: loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName() );
		}
	}
}
