package kodlamaIOSimulation.dataAccess;

import kodlamaIOSimulation.entities.Category;

public interface CategoryDao {
	void add(Category category);
	
	void delete(Category category);
	
	void update(Category category);
}
