package net.mehdi.studentmanagement;

import net.mehdi.studentmanagement.entities.Student;
import net.mehdi.studentmanagement.repo.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

    /*@Bean
    CommandLineRunner commandLineRunner(StudentRepository productRepository){
        return args -> {
            productRepository.save(Student.builder()
                    .name("Computer")
                    .price(450.00)
                    .quantity(55.00)
                    .build());
            productRepository.save(Student.builder()
                    .name("Smart Phone")
                    .price(250.00)
                    .quantity(25.00)
                    .build());
            productRepository.save(Student.builder()
                    .name("tele")
                    .price(480.00)
                    .quantity(5.00)
                    .build());
        };
    }*/
}
