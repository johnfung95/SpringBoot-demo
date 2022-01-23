package com.example.demo;

import com.example.demo.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
// makes this class restful to server rest endpoints
//@RestController (the controller will be done inside the Student package now)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	// getting rest end points
	//@GetMapping
	// the method is an endpoint
//	public String hello() {
//		return "Hello World!";
//	}

	// unable to @Getmapping for the second time, probably because that there is only 1 endpoint now
	// TODO: figure out how to add more endpoints
//	public List<String> hello() {
//		// the result returns in a json format, can review from browser
//		// Chrome / Brave does not have built-in json prettier
//		// can use Firefox with json prettier function built-in
//		return List.of("Hello", "World");
//	}
//

	// the following will be placed into the StudentController class
//	public List<Student> hello() {
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
//	}
}
