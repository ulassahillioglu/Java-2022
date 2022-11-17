package kodlamaIOSimulation.business;

import java.util.List;

import kodlamaIOSimulation.core.logging.Logger;
import kodlamaIOSimulation.dataAccess.CategoryDao;
import kodlamaIOSimulation.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	public CategoryManager() {
		
	}

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	public void add(Category category) throws Exception {
		for(Category newCategory : categories) {
			if(newCategory.getName().equals(category.getName())){
				throw new Exception("Category name cannot repeat itself");
			}
		}
		categoryDao.add(category);
		categories.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getName());
		}
	}
}
