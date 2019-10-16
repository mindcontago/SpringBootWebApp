package com.archie.SpringBootWebApp100.service;

import com.archie.SpringBootWebApp100.dto.MyDtoByCriteria;
import com.archie.SpringBootWebApp100.entity.Student;
import com.archie.SpringBootWebApp100.repositoty.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;

    public List<Student> listOfStudents(MyDtoByCriteria myDtoByCriteria) {// здесь получить лист критериев и возвр лист стубентов
        List<Student> all = studentRepository.findAll();
        myDtoByCriteria.getCriterias();
        return all;
    }

//    // GET
//    public Student getStudent(Long id) {
//        return StudentRepository.findOne(Long.toString(id));
//    }
//    // POST
//    public void addStudent(Student student) {
//        StudentRepository.save(student);
//    }
//
//    // PUT
//    public void updateStudent(Long id, Student student) {
//        StudentRepository.save(student);
//    }
//
//    // DELETE
//    public void deleteStudent(Long id) {
//        Student student = studentRepository.findOne(Long.toString(id));
//        studentRepository.delete(student);
//    }
}

//здесь будет логика, когда разьерусь Критерия биледр как работает

