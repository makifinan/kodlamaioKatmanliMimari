package dataAccess.concrete.hibernate;

import dataAccess.Abstract.CategoryDao;
import entities.concrete.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("kategori hibernate ile eklendi.");
		
	}

}
