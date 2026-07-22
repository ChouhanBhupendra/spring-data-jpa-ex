package comtelusko.spring_data_jpa_ex;

import comtelusko.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

	 ApplicationContext context =  SpringApplication.run(SpringDataJpaExApplication.class, args);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		s1.setRollNo(101);
//		s1.setName("Navin");
//		s1.setMarks(75);
//
//
		s2.setRollNo(102);
		s2.setName("Kiran");
		s2.setMarks(55);
//
//
//		s3.setRollNo(103);
//		s3.setName("Harsh");
//		s3.setMarks(70);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

		// Get all
//		System.out.println(repo.findAll());

		// getbyId
//		Optional<Student> s = repo.findById(103);
//		System.out.println(s.orElse(new Student()));
//
//		// FindByName
//		System.out.println(repo.findByName("Navin"));
//
//		// FindByMarks
//		System.out.println(repo.findByMarks(75));

		//   System.out.println(repo.save(s2));
		repo.delete(s2);



	}

}
