import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lk.codelab.sms.modal.Student;
import lk.codelab.sms.service.StudentService;
import lk.codelab.sms.service.StudentServiceImpl;

public class Application {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		StudentService service = context.getBean("studentService",StudentService.class);
		 List<Student> studets = service.fetchAllStudents();
		for (Student s : studets) {
			System.out.println(s.getName());
		}
		
		
	}

}
