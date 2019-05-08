package lk.codelab.sms.service;

import java.util.List;

import lk.codelab.sms.modal.Student;
import lk.codelabs.sms.repository.StudentRepository;
import lk.codelabs.sms.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {

	StudentRepository repository;
	
	public StudentRepository getRepository() {
		return repository;
	}

	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Student> fetchAllStudents() {
		
		return repository.fetchAllStudents();
	}

}
