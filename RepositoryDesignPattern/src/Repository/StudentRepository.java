package Repository;

import Model.Student;

public interface StudentRepository {
	public Student getStudentByID (int Id);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int studentID);
	public boolean exists(int studentID);

}
