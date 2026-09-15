package net.mehdi.studentmanagement.service;

import net.mehdi.studentmanagement.entities.Student;
import net.mehdi.studentmanagement.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    public List<Student> searchStudents(String keyword) {
        return studentRepository.findByNameContainsIgnoreCase(keyword);
    }
}
