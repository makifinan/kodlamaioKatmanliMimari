package entities.concrete;

public class Course {
	private int id;
	private String name;
	private int instructor;
	private int percentageOfCompletion;
	private int price;
	
	public Course() {
		
	}
	
	public Course(int id, String name, int instructor, int percentageOfCompletion, int price) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.percentageOfCompletion = percentageOfCompletion;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInstructor() {
		return instructor;
	}

	public void setInstructor(int instructor) {
		this.instructor = instructor;
	}

	public int getPercentageOfCompletion() {
		return percentageOfCompletion;
	}

	public void setPercentageOfCompletion(int percentageOfCompletion) {
		this.percentageOfCompletion = percentageOfCompletion;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
}
