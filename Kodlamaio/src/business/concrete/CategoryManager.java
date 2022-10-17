package business.concrete;

import java.util.List;

import business.Abstract.CategoryService;
import core.logging.Abstract.Logger;
import dataAccess.Abstract.CategoryDao;
import entities.concrete.Category;

public class CategoryManager implements CategoryService{

	private CategoryDao categoryDao;
	private Logger[] loggers;
	List<Category> categories;
	
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}



	@Override
	public void add(Category category) throws Exception {
		for(Category category_ : categories) {
			
			if(category_.getName()==category.getName()) {
				throw new Exception("Kategori ismi tekrar edilemez");
				
			} 
				
			}
		categoryDao.add(category);
		for(Logger logger_ : loggers) {
		logger_.log(category.getName());
		}
		
		
		
		
		
	}

}
