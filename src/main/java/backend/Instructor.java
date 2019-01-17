package backend;

public class Instructor implements EducationalMember {

	String name;
	int instructorId;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public void presentYourself() {
		System.out
				.println("I'm an instructor, my name is:" + getName() + " and my instructorId is:  " + getInstructorId());

	}

}
