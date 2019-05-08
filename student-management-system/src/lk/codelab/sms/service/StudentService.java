package lk.codelab.sms.service;

import java.util.List;


import lk.codelab.sms.modal.Student;

public interface StudentService  {

	public List<Student> fetchAllStudents();
}
