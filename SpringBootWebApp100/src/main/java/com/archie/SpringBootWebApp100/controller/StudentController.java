package com.archie.SpringBootWebApp100.controller;

import com.archie.SpringBootWebApp100.dto.DtoByCriteria;
import com.archie.SpringBootWebApp100.entity.Student;
import com.archie.SpringBootWebApp100.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PutMapping("/criterias")
    public List<Student> findByCriterias(@RequestBody DtoByCriteria dtoByCriteria) {
        return studentService.listOfStudents(dtoByCriteria);
    }
}

