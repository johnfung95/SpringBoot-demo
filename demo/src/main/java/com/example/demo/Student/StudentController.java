package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
// instead of just localhost:8080
// the following will specify the path as localhost:8080/api/v1/student)
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
		// the following will now be moved to the Student Service class, so that the Controller only has to call the service class for action
	public List<Student> getStudent() {
//		return List.of(
//				new Student(
//						// need to specify the Long type with 'L' attached to the end of the integer
//						1L,
//						"John",
//						"ct.john.fung@ico.com.hk",
//						LocalDate.of(2000,1,20),
//						16
//				),
//				new Student (
//						"William",
//						"pianist@gmail.com",
//						LocalDate.of(1995,5,20),
//						26
//				) ,
//				new Student()
//		);
		return studentService.getStudent();
	}

	@PostMapping
	public void registerStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}

	@DeleteMapping(path = "{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long id) {
		studentService.deleteStudent(id);
	}

	@PutMapping(path = "{studentId}")
	public void updateStudent(@PathVariable("studentId") Long id, @RequestParam(required=false) String name, @RequestParam(required=false) String email) {
		// use the setter method in the student class
		studentService.updateStudent(id, name, email);
	}
}
