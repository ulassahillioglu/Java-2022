package kodlamaIOSimulation.dataAccess.JDBC;

import kodlamaIOSimulation.dataAccess.CategoryDao;
import kodlamaIOSimulation.entities.Category;

public class CategoryDaoJdbc implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Saved in database via JDBC");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Removed from database : JDBC");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Information updated using JDBC: " + category);
		
	}

}
