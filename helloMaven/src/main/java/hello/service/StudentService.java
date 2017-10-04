package hello.service;

import hello.model.Student;
import hello.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> studentNamesStartingWith(String segment) {
        return studentRepository.findByFirstNameSegment(segment);
    }
}
