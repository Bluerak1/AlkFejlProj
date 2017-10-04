package hello.repository;

import hello.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    Student findByNeptun(String neptun);

    @Query("select s.lastname from Student s where s.firstname like ?1%")
    List<Student> findByFirstNameSegment(String firstName);
}
