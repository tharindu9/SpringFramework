package lk.codelabs.sms.repository;

import java.util.List;

import lk.codelab.sms.modal.Student;

public interface StudentRepository {
	
	public List<Student> fetchAllStudents();
		
	

}
