package net.mehdi.studentmanagement.web;

import net.mehdi.studentmanagement.entities.Student;
import net.mehdi.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public String students(
            @RequestParam(required = false) String keyword,
            Model model) {

        List<Student> students;

        if (keyword != null && !keyword.trim().isEmpty()) {
            students = studentService.searchStudents(keyword);
        } else {
            students = studentService.getAllStudents();
        }

        model.addAttribute("students", students);
        model.addAttribute("keyword", keyword);

        return "students";
    }

    @GetMapping("/addStudent")
    public String addStudent(Model model) {

        model.addAttribute("student", new Student());

        return "add-student";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(Student student) {

        studentService.saveStudent(student);

        return "redirect:/students";
    }

    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam Long id) {

        studentService.deleteStudent(id);

        return "redirect:/students";
    }
}



