package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student(
                // need to specify the Long type with 'L' attached to the end of the integer
                1L,
                "John",
                "ct.john.fung@ico.com.hk",
                LocalDate.of(2000,1,20)
            );

            Student william = new Student (
                "William",
                "pianist@gmail.com",
                LocalDate.of(1995,5,20)
            );

            studentRepository.saveAll(
                    List.of(john, william)
            );
        };
    }
}
