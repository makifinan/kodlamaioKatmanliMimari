package dataAccess.concrete.jdbc;

import dataAccess.Abstract.CategoryDao;
import entities.concrete.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("kategori jdbc ile eklendi.");
		
	}

}
