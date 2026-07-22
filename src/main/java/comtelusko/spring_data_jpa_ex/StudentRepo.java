package comtelusko.spring_data_jpa_ex;

import comtelusko.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository <Student, Integer>{


    List<Student> findByName(String name);
    List<Student> findByMarks(int marks);
  //  List<Student> fidByMarksGreaterThan(int marks);
}
