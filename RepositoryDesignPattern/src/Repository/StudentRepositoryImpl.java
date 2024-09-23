package Repository;

import java.util.HashMap;

import Model.Student;



public class StudentRepositoryImpl implements StudentRepository {

    // Singleton instance
    private static StudentRepositoryImpl instance;
    
    // Object lock for synchronization
    private static final Object lock = new Object();
    
    private HashMap<Integer, Student> studentsList;

    // Private constructor to prevent external instantiation
    private StudentRepositoryImpl() {
        studentsList = new HashMap<>();
    }

    // Static method to get the singleton instance using an object lock
    public static StudentRepositoryImpl getInstance() {
    	if(instance == null) {
    		synchronized (lock) {
    			if(instance == null) {
    				instance = new StudentRepositoryImpl();
    			}
				
			}
    	}
    	return instance;
    }

    @Override
    public Student getStudentByID(int id) {
        return studentsList.get(id);
    }

    @Override
    public void addStudent(Student student) {
        studentsList.put(student.getStudentID(), student);
    }

    @Override
    public void updateStudent(Student student) {
        studentsList.get(student.getStudentID()).setName(student.getName());
        studentsList.get(student.getStudentID()).setEmail(student.getEmail());
    }

    @Override
    public void deleteStudent(int studentID) {
        studentsList.remove(studentID);
    }

    @Override
    public boolean exists(int studentID) {
        return studentsList.containsKey(studentID);
    }
}
