package Model;

public class Student {
	private int studentID;
	private String name,email;
	public Student(int studentID, String name, String email) {
		this.studentID = studentID;
		this.name = name;
		this.email = email;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}
