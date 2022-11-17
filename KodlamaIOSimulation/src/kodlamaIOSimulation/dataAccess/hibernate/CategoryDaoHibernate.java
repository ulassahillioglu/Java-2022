package kodlamaIOSimulation.dataAccess.hibernate;

import kodlamaIOSimulation.dataAccess.CategoryDao;
import kodlamaIOSimulation.entities.Category;

public class CategoryDaoHibernate implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Saved to database via Hibernate");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Deleted from database : Hibernate");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Information updated using hibernate: " + category);
		
	}

}
