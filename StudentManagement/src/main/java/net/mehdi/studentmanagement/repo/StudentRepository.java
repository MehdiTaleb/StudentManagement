package net.mehdi.studentmanagement.repo;

import net.mehdi.studentmanagement.entities.Student;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByNameContainsIgnoreCase(String keyword);

}
