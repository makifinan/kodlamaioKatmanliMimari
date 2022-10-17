package entities.concrete;

public class Category {
	private int id;
	private String Name;
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}
