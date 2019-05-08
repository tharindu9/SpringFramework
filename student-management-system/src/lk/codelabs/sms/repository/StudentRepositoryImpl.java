package lk.codelabs.sms.repository;

import java.util.ArrayList;
import java.util.List;

import lk.codelab.sms.modal.Student;

public class StudentRepositoryImpl implements StudentRepository {

	@Override
	public List<Student> fetchAllStudents() {
		List<Student> students = new ArrayList<Student>();
		Student student = new Student();
		student.setId(1);
		student.setName("Tharindu");
		students.add(student);
		
		return students;
	}

}
