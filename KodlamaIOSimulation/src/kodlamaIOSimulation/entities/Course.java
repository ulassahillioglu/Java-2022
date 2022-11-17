package kodlamaIOSimulation.entities;

public class Course {
	private int id;
	private String courseName;
	private double price;
	private String description;
	private String instructorName;
	
	public Course() {
		
	}

	public Course(int id, String courseName, double price, String description,String instructorName) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.price = price;
		this.description = description;
		this.instructorName = instructorName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
