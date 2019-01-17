package backend;

public class Student implements EducationalMember {

	String name;
	int studentId;


	public String getName() {
		return name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void presentYourself() {
		System.out.println("I'm a student, my name is: " + getName() + " and my studentID is: " + getStudentId());

	}

}
